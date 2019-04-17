package com.study.suit;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

import com.study.settings.GlobalSettings;

public class Testweishao {

	public static void main(String[] args) throws ProtocolException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("mobile","15011431111");
		map.put("password", "123456");
		HttpClientHelper.doGet(GlobalSettings.loginW,map);
		

	}

}
