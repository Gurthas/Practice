package com.study.dataprovider;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class LoginProvider {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("userName", "13651811122");
		String json = JSON.toJSONString(map);
		System.out.println(json);


		
	}
}
