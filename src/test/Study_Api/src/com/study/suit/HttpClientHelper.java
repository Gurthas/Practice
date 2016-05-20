package com.study.suit;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.JsonObject;

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
		//创建HttpClient对象
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建请求方法实例，指定url
		HttpPost post = new HttpPost(url);
		List<NameValuePair> list = new ArrayList<NameValuePair>(params.size());
		for (Entry<String, String> entry : params.entrySet()) {
			NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
			list.add(pair);	
		};
		post.setEntity(new UrlEncodedFormEntity(list, StandardCharsets.UTF_8));
		//调用HttpClient对象的execute(HttpUriRequest request)发送请求，该方法返回一个HttpResponse
		CloseableHttpResponse response = httpclient.execute(post);
		/*调用HttpResponse的getAllHeaders()、getHeaders(String name)等方法可获取服务器的响应头；
		 *调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包装了服务器的响应内容。
		 *程序可通过该对象获取服务器的响应内容
		 */
		try {
			HttpEntity entity = response.getEntity();
			int statusCode = response.getStatusLine().getStatusCode();
			System.out.println("执行状态码 : " + statusCode);
			httpstr = EntityUtils.toString(entity, "GBK");
			System.out.println(list);
			System.out.println(httpstr);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
			//释放连接
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
	
	public static String doPostJson(String url, JSONObject params) throws ClientProtocolException, IOException {
		String result = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		//创建请求方法实例，指定url
		HttpPost post = new HttpPost(url);
		StringEntity s = new StringEntity(params.toString());    
		          s.setContentEncoding("UTF-8");    
		          s.setContentType("application/json");    
	          post.setEntity(s); 
		//调用HttpClient对象的execute(HttpUriRequest request)发送请求，该方法返回一个HttpResponse
		CloseableHttpResponse response = httpclient.execute(post);
		/*调用HttpResponse的getAllHeaders()、getHeaders(String name)等方法可获取服务器的响应头；
		 *调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包装了服务器的响应内容。
		 *程序可通过该对象获取服务器的响应内容
		 */
		try {
			
			HttpEntity entity = response.getEntity();
			int statusCode = response.getStatusLine().getStatusCode();
			System.out.println("执行状态码 : " + statusCode);
			result = EntityUtils.toString(entity, "GBK");
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
			//释放连接
		} finally {
			response.close();
		}
		return result;

}
}
