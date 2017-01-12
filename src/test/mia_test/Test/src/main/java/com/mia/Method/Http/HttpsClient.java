package com.mia.Method.Http;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
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
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HttpsClient {
	// private static String httpUrl = "http://api.miyabaobei.com/";
	private static Logger log = LogManager.getLogger("HttpsClient");

	// 重写验证方法，取消检测SSL
	private static TrustManager manger = new X509TrustManager() {

		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		}

		public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
		}
	};

	private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(30 * 1000)
			.setConnectTimeout(20 * 1000).setConnectionRequestTimeout(20 * 1000).setExpectContinueEnabled(true).build();

	/**
	 * 访问https的网站
	 * 
	 * @param httpclient
	 */
	public static String httpsClient(String url, String params) {
		String httpUrl = "https://api.miyabaobei.com/";
		String responseContent = null;
		CloseableHttpClient httpsClient = null;
		JsonObject result = null;
		CloseableHttpResponse response = null;
		String URL = httpUrl + url;

		HttpPost httpPost = new HttpPost(URL);
		httpPost.setHeader("User-Agent", "miyatest");
		httpPost.setHeader("Accept", "*/*");
		httpPost.setHeader("Connection", "Keep-Alive");
		httpPost.setConfig(requestConfig);

		// 调用ssl
		try {
			SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext,
					NoopHostnameVerifier.INSTANCE);
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslsf).build();
			sslcontext.init(null, new TrustManager[] { manger }, null);
			PoolingHttpClientConnectionManager poolConnManager = new PoolingHttpClientConnectionManager(
					socketFactoryRegistry);
			poolConnManager.setMaxTotal(200);
			poolConnManager.setDefaultMaxPerRoute(20);
			SocketConfig socketConfig = SocketConfig.custom().setSoTimeout(20000).build();
			poolConnManager.setDefaultSocketConfig(socketConfig);
			httpsClient = HttpClients.custom().setConnectionManager(poolConnManager).build();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// 设置参数
			StringEntity reqEntity = new StringEntity(params, "UTF-8");
			log.info("\n " + "接口名称：" + URL + "\n请求报文：" + params);
			reqEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
			httpPost.setEntity(reqEntity);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			response = httpsClient.execute(httpPost);
			// HttpEntity entity = null;
			HttpEntity entity = response.getEntity();
			responseContent = EntityUtils.toString(entity, "UTF-8");
			if (response.getStatusLine().getStatusCode() == 404) {
				log.info("请求失败，HTPP状态信息：" + response.getStatusLine().getStatusCode() + "\n" + "返回报文信息："
						+ responseContent);

				return "{\"code\": 404,\"msg\":\"HTTP400状态码异常\"}";
			} else {

				result = new JsonParser().parse(responseContent).getAsJsonObject();
				log.info("\n " + "请求名称：" + httpUrl + "\n " + "响应结果：" + result);
				return result.toString();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
				if (httpsClient != null) {
					httpsClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return "{\"code\": 600,\"msg\":\"HTTP请求失败\",\"responseContent\":\"" + responseContent + "\"}";
	}

	public static void main(String[] args) {
		String url = "account/login/";
		String param = "app_id=ios_test_id&auth_session=&dvc_id=miatest115c4f56457d40bf8bab97896b68c0ea&params=OuXjNueOXb9UbG8F-corKFOhQJHlGEQZn_lZp1wJqLXJQdetBlRcZfFI8dyW4_zAhI-EGyHjln-QcBeQouPGcwAtJMB8dbvE-wO5JPos_Dpz7TwpRGKoPp31bgF0FgMpPP_Xi1XbyK3h-622rahma-Gtegl7CGu3dix1anJURPY=m26IXIu0_ZSOSV7fAzjPjmW-7vBW9x0yYLYu6kJ3z0NAItBgkN2FSB1r8YNI6SkcJE2q3c89euZKhlrMQazjx2INyZ4VzXd4EeYVHbt2ZOGb7CQas6pq-4wPTtYxxY4GDGeBaBFbWXSfuqrpvARnJkn1SzLLrcBxFU-Ucju7slw=Cu3eWMOJ3Tn4TR-5ZfikzSzUru726xoeqfKVvHoVskim6LsB1SBv4RUbnZkh5WpvK_9HG4mMAjCax8qBWohdDRYn3udcKJ0d3EWwgjuNJtqcECvOqLfOKXQSxuxXeel26hS9VRXHMAvX4DeL5eS6F__8_OtW-cyRpxgx_N5is2o=&regid=miatest115c4f56457d40bf8bab97896b68c0ea&session=147971828606183175&sign=eda510392119e75977c83d7d503a280d&timestamp=1479718286&version=ios_4_7_0";
		System.out.println(httpsClient(url, param));

	}
}
