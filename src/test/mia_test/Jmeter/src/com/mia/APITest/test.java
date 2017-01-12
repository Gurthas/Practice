package com.mia.APITest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;
import com.mia.test.Base64Utils;
import com.mia.test.Bulid;
import com.mia.test.Httpclient;
import com.mia.test.JsonParse;

public class test {
	public static Map<String, ArrayList<String>> User_Map;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String ,String> map2 =new HashMap<>();
		map2.put("172.16.96.33_18201049123", "123456");
		System.out.println(map2.get("172.16.96.33_18201049123"));
		String user ="18201049123";
		String pwd ="123456";
		String IP ="172.16.96.33";
		String Http ="https";
		String Chanel ="IOS";
		String Version ="5_0_0";
		
		Login.user(user, pwd, IP, Http, Chanel, Version);
	}
	 public static ArrayList<String> user(String user ,String pwd ,String IP ,String Http ,String Chanel ,String Version ){
	    	User_Map = new TreeMap<String, ArrayList<String>>();
	    	String key = IP + user;
	    	if(User_Map.get(key) == null){
	    		Map<String, Object> map = new HashMap<String, Object>();
	    		String b64name = Base64Utils.getBase64("miababy" + user);
	    		String b64pwd = Base64Utils.getBase64("miababy" + pwd);
	    		map.put("name", b64name);
	    		map.put("password", b64pwd);
	    		String json = JSON.toJSONString(map);
	    		String requests = Bulid.Params(0, json, Chanel, Version, "");
	    		StringBuffer url = new StringBuffer();
	    		
	    		url.append(Http).append("://").append(IP).append("/account/login");
	    		ArrayList<String> list = new ArrayList<String>();
	    		
	    		String response =Httpclient.sendHttpPost(url.toString(),requests);

	    		if(JsonParse.code(response).equals("200") &&  JsonParse.code("content/code").equals("0") != false){
	    			list.add(JsonParse.code(response, "content/auth_session"));
	    			list.add(JsonParse.code(response, "content/code"));
	    			System.out.println(list.toString());
	    			User_Map.put(key, list);
	    		}else{
	    			System.out.println("null" + response);
	    			return null;
	    		}
	    	}
			return User_Map.get(key);
	    	
	    	
	    }
}
