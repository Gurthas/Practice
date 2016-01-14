package testbaidu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Httpclientt
{
	public void byGetMethod() throws IOException, ClientProtocolException
	{
		CloseableHttpClient httpclient = HttpClients.createDefault();

		HttpGet get = new HttpGet("http://passport.hupu.com/pc/login");
		System.out.println("执行get请求" + get.getURI());
		CloseableHttpResponse response = null;

		response = httpclient.execute(get);
		HttpEntity entity = response.getEntity();
		if (entity != null)
		{
			System.out.println("响应状态码:" + response.getStatusLine());
			System.out.println(
					"-------------------------------------------------");
			System.out.println("响应内容:" + EntityUtils.toString(entity));
			System.out.println(
					"-------------------------------------------------");
			response.close();

		}
	}

	public void byPostMethod() throws IOException, ClientProtocolException
	{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://passport.hupu.com/pc/login");
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("login", "sunguojian001"));
		list.add(new BasicNameValuePair("pw", "sun312171"));
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list,
				StandardCharsets.UTF_8);
		post.setEntity(uefEntity);
		System.out.println("POST 请求...." + post.getURI());
		CloseableHttpResponse response = null;
		response = httpclient.execute(post);
		HttpEntity entity = response.getEntity();
		if (null != entity)
		{
			System.out.println(
					"-------------------------------------------------------");
			System.out.println("响应状态码:" + response.getStatusLine());
			System.out.println(
					"-------------------------------------------------------");
			System.out.println(EntityUtils.toString(uefEntity));
			System.out.println(
					"-------------------------------------------------------");
			if(response.getStatusLine().getStatusCode() == 302){
				String locationURrl = response.getLastHeader("location").getValue();
			}
			response.close();
			httpclient.close();
		}
	}
}
