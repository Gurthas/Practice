package com.study.suit;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpClientHelper {

	public static String doPost(String url, Map<String, String> params) throws IOException, ProtocolException {

		String httpstr = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		List<NameValuePair> list = new ArrayList<NameValuePair>(params.size());
		for (Entry<String, String> entry : params.entrySet()) {
			NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
			list.add(pair);
		}
		post.setEntity(new UrlEncodedFormEntity(list, StandardCharsets.UTF_8));
		CloseableHttpResponse response = httpclient.execute(post);
		try {
			HttpEntity entity = response.getEntity();
			int statusCode = response.getStatusLine().getStatusCode();
			System.out.println("执行状态码 : " + statusCode);
			httpstr = EntityUtils.toString(entity, "GBK");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			response.close();
		}
		return httpstr;
	}

	public static String doGet(String url, Map<String, String> params) {
		StringBuffer param = new StringBuffer();
		int i = 0;
		for (String key : params.keySet()) {
			if (i == 0)
				param.append("?");
			else
				param.append("&");
			param.append(key).append("=").append(params.get(key));
			i++;
		}
		url += param;
		String result = null;
		HttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpGet = new HttpGet(url);
			HttpResponse response = httpclient.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();

			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity, "GBK");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
