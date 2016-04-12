package com.httpclient.practice;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class HttpclientUtil1 {
	public static String post(String url, Map<String, String> params)
			throws IOException, ProtocolException {
		String httpstr = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String body = null;
		HttpPost post = new HttpPost(url);
		List<NameValuePair> list = new ArrayList<NameValuePair>(params.size());
		for (Entry<String, String> entry : params.entrySet()) {
			NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry
					.getValue().toString());
			list.add(pair);
			UrlEncodedFormEntity uefentity = new UrlEncodedFormEntity(list,
					StandardCharsets.UTF_8);
			post.setEntity(uefentity);

			CloseableHttpResponse response = httpclient.execute(post);
			HttpEntity entity = response.getEntity();
			httpstr = EntityUtils.toString(entity, StandardCharsets.UTF_8);
			System.out.println(httpstr);
			if (entity != null) {
				System.out.println(response.toString());
				httpclient.close();

			}
		}

		return httpstr;
	}
}
