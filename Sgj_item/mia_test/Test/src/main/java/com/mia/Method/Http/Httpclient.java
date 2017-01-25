package com.mia.Method.Http;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.mia.data.Constant;

public class Httpclient {
	private static Logger log = LogManager.getLogger("Httpclient");

	private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(30 * 1000)
			.setConnectTimeout(20 * 1000).setConnectionRequestTimeout(20 * 1000).build();
	static DefaultConnectionKeepAliveStrategy keepAliveStrat = new DefaultConnectionKeepAliveStrategy() {

		@Override
		public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
			long keepAlive = super.getKeepAliveDuration(response, context);
			if (keepAlive == -1) {
				keepAlive = 5000;
			}
			return keepAlive;
		}

	};
	// 重写验证方法，取消检测SSL
	private static TrustManager manger = new X509TrustManager() {

		// @Override
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		// @Override
		public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		}

		// @Override
		public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		}
	};

	// 设置域名
	// private static String url = "http://api.miyabaobei.com/";

	public static String sendHttpPost(String httpUrl, String params) {
		String responseContent = null;
		String result = null;
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		String URL = Constant.url + httpUrl;

		HttpPost httpPost = new HttpPost(URL);
		httpPost.setHeader("User-Agent", "miyatest");
		httpPost.setHeader("Accept", "*/*");
		httpPost.setHeader("Connection", "Keep-Alive");
		httpPost.setConfig(requestConfig);
		if (URL.charAt(4) == 's') {
			try {
				SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy())
						.build();
				SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext,
						NoopHostnameVerifier.INSTANCE);
				Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder
						.<ConnectionSocketFactory> create()
						.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslsf)
						.build();
				sslcontext.init(null, new TrustManager[] { manger }, null);
				PoolingHttpClientConnectionManager poolConnManager = new PoolingHttpClientConnectionManager(
						socketFactoryRegistry);
				poolConnManager.setMaxTotal(200);
				poolConnManager.setDefaultMaxPerRoute(20);
				SocketConfig socketConfig = SocketConfig.custom().setSoTimeout(20000).build();
				poolConnManager.setDefaultSocketConfig(socketConfig);
				httpClient = HttpClients.custom().setConnectionManager(poolConnManager).build();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			httpClient = HttpClients.custom().setKeepAliveStrategy(keepAliveStrat).build();
		}

		try {
			// 设置参数
			StringEntity reqEntity = new StringEntity(params, "UTF-8");
			log.info("\n" + "接口名称：" + URL + "\n请求报文：" + params);
			reqEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
			httpPost.setEntity(reqEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			response = httpClient.execute(httpPost);
			// HttpEntity entity = null;
			HttpEntity entity = response.getEntity();
			responseContent = EntityUtils.toString(entity, "UTF-8");
			if (response.getStatusLine().getStatusCode() == 404) {
				log.info("请求失败，HTPP状态信息：" + response.getStatusLine().getStatusCode() + "\n" + "返回报文信息："
						+ responseContent);
				return "{\"code\":404,\"msg\":\"HTTP400状态码异常\"}";
			} else {
				// result = JSON.parseObject(responseContent);
				result = JSON.parse(responseContent).toString();
				// result = new
				// JsonParser().parse(responseContent).getAsJsonObject();
				 log.info("\n" + "响应结果：" + result);
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "{\"code\": 600,\"msg\":\"HTTP请求失败\",\"responseContent\":\"" + responseContent + "\"}";
	}

}
