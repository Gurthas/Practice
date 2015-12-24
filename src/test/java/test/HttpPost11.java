package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;

public class HttpPost11
{
public static void main(String[] args) throws IOException,ClientProtocolException
{   //设置登录参数
	CloseableHttpClient httpclient = HttpClients.createDefault();
	List<NameValuePair> formparams = new ArrayList<NameValuePair>();
	formparams.add(new BasicNameValuePair("Login_Name", "222"));
	formparams.add(new BasicNameValuePair("Login_PassWord", "123456"));
	UrlEncodedFormEntity entity1 = new UrlEncodedFormEntity(formparams,StandardCharsets.UTF_8);
	
	//创建post请求实例
	HttpPost httppost = new HttpPost("http://www.itimenet.com/Login.aspx");
	httppost.setEntity(entity1);
	//处理请求,得到相应
	HttpResponse response = httpclient.execute(httppost);
	//打印cookie信息
	String set_cookie = response.getFirstHeader("set_cookie").getValue();
	//打印返回结果
	HttpEntity entity = response.getEntity();
	StringBuilder result = new StringBuilder();
	if(entity!=null){
		InputStream instream = entity.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(instream));
		String temp = "";
		while((temp = br.readLine())!=null){
			String str = new String(temp.getBytes(),StandardCharsets.UTF_8) ;
			result.append(str);
			
		}
	}
	System.out.println(result);
	
}
}
