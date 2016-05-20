package com.study.dataprovider;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

import com.study.settings.GlobalSettings;
import com.study.suit.HttpClientHelper;

public class testJson {
	
	public static void main(String[] args) throws ProtocolException, IOException {
		Map<String,String> map = new HashMap<String,String>();
		map.put("loginName","13901111111");
		map.put("password", "123456");
		HttpClientHelper.doPost(GlobalSettings.loginJson, map);
		
	}
		

		
	
}
