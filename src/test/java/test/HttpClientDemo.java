package test;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientDemo
{
	public static void main(String[] args) throws IOException
	{
		// 创建默认的客户端实例
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建Get请求实例
		HttpGet httpget = new HttpGet("http://www.zhihu.com");
		System.out.println("executing request " + httpget.getURI());
		CloseableHttpResponse response1 = null;
		try
		{
			// 客户端执行get请求,返回响应实体
			response1 = httpclient.execute(httpget);
			// 服务器响应状态行
			System.out.println(response1.getStatusLine());
			Header[] heads = response1.getAllHeaders();
			// 打印所有响应头
			for (Header h : heads)
			{
				System.out.println(h.getName() + ":" + h.getValue());
			}
			// 获取响应消息实体
			HttpEntity entity = response1.getEntity();

			System.out.println("------------------------------------");

			if (entity != null)
			{

				// 响应内容
				System.out.println(EntityUtils.toString(entity));

				System.out.println("----------------------------------------");
				// 响应内容长度
				System.out.println("响应内容长度：" + entity.getContentLength());
			}

		} catch (ClientProtocolException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			response1.close();
		}
	}

}
