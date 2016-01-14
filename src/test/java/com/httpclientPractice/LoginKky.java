package com.httpclientPractice;

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

public class LoginKky
{
	String verify_code = null;
public void doPost1()throws IOException,ClientProtocolException{
	long ctime = System.currentTimeMillis();
	String stime = String.valueOf(ctime);
	CloseableHttpClient httpclient1 = HttpClients.createDefault();
	HttpPost post1 = new HttpPost("http://dev.shark.kuaikuaiyu.com/api.login.sms?version=0,17&distribution=nightly");
	List<NameValuePair> list1 = new ArrayList<NameValuePair>();
	list1.add(new BasicNameValuePair("mobile", "15011431186"));
	list1.add(new BasicNameValuePair("sms_token",stime));
	list1.add(new BasicNameValuePair("sid", "haode"));
	UrlEncodedFormEntity uefEntity1 = new UrlEncodedFormEntity(list1,
			StandardCharsets.UTF_8);
	post1.setEntity(uefEntity1);
	System.out.println("POST 请求...." + post1.getURI());
	CloseableHttpResponse response = null;
	response = httpclient1.execute(post1);
	HttpEntity entity1 = response.getEntity();
	if (null != entity1)
	{
		System.out.println(
				"-------------------------------------------------------");
		System.out.println("响应状态码:" + response.getStatusLine());
		System.out.println(
				"-------------------------------------------------------");
		System.out.println(EntityUtils.toString(uefEntity1));
		System.out.println(
				"-------------------------------------------------------");
		System.out.println(EntityUtils.toString(entity1));
		System.out.println(
				"-------------------------------------------------------");
		/*if(response.getStatusLine().getStatusCode() == 302){
			String locationURrl = response.getLastHeader("location").getValue();
		}
		*/
		
		response.close();
		httpclient1.close();
	}
}
public  void doGet() throws ClientProtocolException,IOException{
	CloseableHttpClient httpclient2 = HttpClients.createDefault();
	HttpGet get = new HttpGet("http://dev.shark.kuaikuaiyu.com/debug.code.query?mobile=15011431186");
	System.out.println("执行get请求...." + get.getURI());
	CloseableHttpResponse response2 = null;
	response2 = httpclient2.execute(get);
	HttpEntity entity2 = response2.getEntity();
	if (entity2 != null)
	{
		//System.out.println("响应状态码:" + response2.getStatusLine());
		String verifytext1 = EntityUtils.toString(entity2);
	    verify_code = verifytext1.substring(verifytext1.length()-4,verifytext1.length());
		System.out.println(
				"-------------------------------------------------");
		System.out.println("响应内容:" +"您的验证码为:"+verify_code);
		System.out.println(
				"-------------------------------------------------");
		response2.close();
		httpclient2.close();

	}
}
	
public void doPost2()throws IOException,ClientProtocolException{
	CloseableHttpClient httpclient2 = HttpClients.createDefault();
	HttpPost post2 = new HttpPost("http://dev.shark.kuaikuaiyu.com/api.login?version=0,17&distribution=nightly&platform=ios");
	List<NameValuePair> list2 = new ArrayList<NameValuePair>();
	list2.add(new BasicNameValuePair("mobile", "15011431186"));
	list2.add(new BasicNameValuePair("code",verify_code));
	list2.add(new BasicNameValuePair("user_token", "test_usertoken"));
	list2.add(new BasicNameValuePair("device_token","test_devicetoken"));
	list2.add(new BasicNameValuePair("rdid", "test_rdid"));
	list2.add(new BasicNameValuePair("bb", "blackbox"));
	
	
	UrlEncodedFormEntity uefEntity2 = new UrlEncodedFormEntity(list2,
			StandardCharsets.UTF_8);
	post2.setEntity(uefEntity2);
	System.out.println("POST 请求...." + post2.getURI());
	CloseableHttpResponse response = null;
	response = httpclient2.execute(post2);
	HttpEntity entity3 = response.getEntity();
	if (null != entity3)
	{
		System.out.println(
				"-------------------------------------------------------");
		System.out.println(EntityUtils.toString(uefEntity2));
		System.out.println(
				"-------------------------------------------------------");
		System.out.println(EntityUtils.toString(entity3));
		/*if(response.getStatusLine().getStatusCode() == 302){
			String locationURrl = response.getLastHeader("location").getValue();
		}
		*/
		
		response.close();
		httpclient2.close();
	}
}				
}

