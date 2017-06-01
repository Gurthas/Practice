package com.mia.APITest;

import java.util.ArrayList;
import java.util.Date;
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

public class Login extends AbstractJavaSamplerClient {
	public static Map<String, ArrayList<String>> User_Map  = new HashMap<String, ArrayList<String>>();
	private static String key = "miababy";
	// 定义接口名称
	private String InterfaceName;
	private static String Interface_Name = "接口名称 Interface Name";
	private static String Interface_Name_DEFAULT = "account/login";
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
	private static String Version_ID_EFAULT = "";	
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
		//results.setSampleLabel("login");
		setupValues(context);
		//listParameters(context);
		
		TestName = key + context.getParameter(Test_Name);
		TestPwd = key + context.getParameter(Test_Pwd);
		String b64name = Base64Utils.getBase64(TestName);
		String b64pwd = Base64Utils.getBase64(TestPwd);
		Chanel = context.getParameter(Chanel_Name);
		Version = context.getParameter(Version_ID);
		Login_flag = context.getIntParameter(Loginflag);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", b64name);
		map.put("password", b64pwd);
		String json = JSON.toJSONString(map);
		String requests = Bulid.Params(Login_flag, json, Chanel, Version, "");
/*********************************************************************************/	
		Ip = context.getParameter(IP);
		InterfaceName = context.getParameter(Interface_Name);
		Http = context.getParameter(HTTP);
		
		StringBuffer url = new StringBuffer();
		if(InterfaceName.charAt(0) == '/'){
			url.append(Http).append("://").append(Ip).append(InterfaceName);
		}else{
			url.append(Http).append("://").append(Ip).append("/").append(InterfaceName);
		}
		String response =Httpclient.sendHttpPost(url.toString(),requests);

		results.sampleStart();
		results.sampleEnd();
		
		results.setDataEncoding("UTF-8");
		results.setSamplerData("业务参数：" + map + "\n请求参数：\n" + requests );
		results.setResponseCode("200");
		results.setResponseData(response);
		results.setResponseMessage("ok");
		results.setSuccessful(true);
		return results;
	}
	@Override
	public void teardownTest(JavaSamplerContext context) {				
	}
    private void listParameters(JavaSamplerContext context) {
        Iterator<String> argsIt = context.getParameterNamesIterator();
        while (argsIt.hasNext()) {
            String name = argsIt.next();
            System.out.println(name + "=" + context.getParameter(name));
        }
    
    }
    public static ArrayList<String> user(String user ,String pwd ,String IP ,String Http ,String Chanel ,String Version ){

    	String Key = IP + user;
    	
    	if(User_Map.get(Key) == null){
    		Map<String, String> map = new HashMap<String, String>();
    		String b64name = Base64Utils.getBase64(key + user);
    		String b64pwd = Base64Utils.getBase64(key + pwd);
    		map.put("name", b64name);
    		map.put("password", b64pwd);
    		String json = JSON.toJSONString(map);
    		String requests = Bulid.Params(0, json, Chanel, Version, "");
    		StringBuffer url = new StringBuffer();
    		url.append(Http).append("://").append(IP).append("/account/login");
    		
    		ArrayList<String> list = new ArrayList<String>();
    		String response =Httpclient.sendHttpPost(url.toString(),requests);
    		
    		if(JsonParse.code(response).equals("200")){
    			list.add(JsonParse.code(response, "content/auth_session"));
    			list.add(JsonParse.code(response, "content/user_id"));
    			
    			User_Map.put(Key, list);
    			
    		}else{
    			return null;
    		}
    	}
    	System.out.println(new Date());
		return User_Map.get(Key);
    	
    	
    }
}
