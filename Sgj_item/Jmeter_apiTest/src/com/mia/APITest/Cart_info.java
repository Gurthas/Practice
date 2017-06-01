package com.mia.APITest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.alibaba.fastjson.JSON;
import com.mia.test.Base64Utils;
import com.mia.test.Bulid;
import com.mia.test.Httpclient;
import com.mia.test.JsonParse;

public class Cart_info extends AbstractJavaSamplerClient {
	private static String key = "miababy";
	// 定义接口名称
	private String InterfaceName;
	private static String Interface_Name = "接口名称 Interface Name";
	private static String Interface_Name_DEFAULT = "cart/info";
	//定义HTTP请求方式
	private String Http;
	private static String HTTP = "Http 连接";
	private static String Http_DEFAULT = "https";
	//定义HTTP请求地址
	private String Ip;
	private static String IP = "Http 地址";
	private static String IP_DEFAULT = "172.16.96.33";
	//定义HTTP请求方法
	private String HttpMethod;
	private static String Http_Method = "Http请求方法(api 默认post)";
	private static String Http_Method_DEFAULT = "post";	
	//定义测试用户登录用户
	private String TestName;
	private static String Test_Name = "用户名";
	private static String Test_Name_DEFAULT = "18201049123";
	//定义测试用户登录用户
	private String TestPwd;
	private static String Test_Pwd = "密码";
	private static String Test_Pwd_DEFAULT = "123456";
	//定义测试版本
	private String Version;
	private static String Version_ID = "API版本";
	private static String Version_ID_EFAULT = "5_0_0";	
	//定义测试渠道
	private String Chanel;
	private static String Chanel_Name = "客户端渠道名称(请全部大写字母)";
	private static String Chanel_Name_EFAULT = "IOS";	
	//定义测试用户登录用户
	private int Login_flag;
	private static String Loginflag = "登录状态(0:未登录，1:登录状态)";
	private static int Loginflag_DEFAULT = 0;
	
	/*
	 * 设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter的参数列表中
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		//// 定义一个参数，显示到Jmeter的参数列表中，第一个参数为参数默认的显示名称，第二个参数为默认值
		params.addArgument(Interface_Name, Interface_Name_DEFAULT);
		params.addArgument(HTTP, Http_DEFAULT);
		params.addArgument(IP,IP_DEFAULT);
		params.addArgument(Http_Method, Http_Method_DEFAULT);
		params.addArgument(Test_Name, Test_Name_DEFAULT);
		params.addArgument(Test_Pwd, Test_Pwd_DEFAULT);
		params.addArgument(Loginflag, Integer.toString(Loginflag_DEFAULT));
		params.addArgument(Chanel_Name, Chanel_Name_EFAULT);
		params.addArgument(Version_ID, Version_ID_EFAULT);
		return params;
	}
	private void setupValues(JavaSamplerContext context) {

		InterfaceName = context.getParameter(Interface_Name, Interface_Name_DEFAULT);
		Ip = context.getParameter(IP, IP_DEFAULT);
		Http = context.getParameter(HTTP, Http_DEFAULT);
		HttpMethod = context.getParameter(Http_Method, Http_Method_DEFAULT);
		TestName = context.getParameter(Test_Name, Test_Name_DEFAULT);
		TestPwd = context.getParameter(Test_Pwd, Test_Pwd_DEFAULT);
		Login_flag = context.getIntParameter(Loginflag, Loginflag_DEFAULT);
		Version = context.getParameter(Version_ID, Version_ID_EFAULT);
		Chanel = context.getParameter(Chanel_Name, Chanel_Name_EFAULT);
	}
	
	@Override
	public void setupTest(JavaSamplerContext arg0){
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult results = new SampleResult();
		setupValues(context);		
		TestName = key + context.getParameter(Test_Name);
		TestPwd = key + context.getParameter(Test_Pwd);
		Chanel = context.getParameter(Chanel_Name);
		Version = context.getParameter(Version_ID);
		Login_flag = context.getIntParameter(Loginflag);
		ArrayList<String> list = new ArrayList<String>();
		
/*********************************************************************************/	
		Ip = context.getParameter(IP);
		InterfaceName = context.getParameter(Interface_Name);
		Http = context.getParameter(HTTP);
		results.sampleStart();
		list =Login.user(TestName, TestPwd, Ip, Http, Chanel, Version);
		String requests = Bulid.Params(Login_flag, "", Chanel, Version, list.get(0));
		StringBuffer url = new StringBuffer();
		if(InterfaceName.charAt(0) == '/'){
			url.append(Http).append("://").append(Ip).append(InterfaceName);
		}else{
			url.append(Http).append("://").append(Ip).append("/").append(InterfaceName);
		}
		String response =Httpclient.sendHttpPost(url.toString(),requests);
	
		results.sampleEnd();
		
		results.setDataEncoding("UTF-8");
		results.setSamplerData("业务参数："  + "\n请求参数：\n" + requests );
		String code = JsonParse.code(response);
		if(code.equals("200")){
			results.setResponseCode("200");
			results.setResponseData(response);
			results.setResponseMessage("ok");	
			results.setSuccessful(true);
		}else{
			results.setResponseCode(code);
			results.setResponseData(response);
			results.setResponseMessage("fail");
			results.setSuccessful(false);
		}
		return results;
	}
	@Override
	public void teardownTest(JavaSamplerContext context) {				
	}

 
}
