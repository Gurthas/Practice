package com.mia.Test;

import java.util.Map;
import java.util.TreeMap;

import com.mia.Encrypt.Base64Utils;
import com.mia.Method.Param.Bulid;
import com.alibaba.fastjson.JSON;

public class Login {

	private static String key = "miababy";

	public static String account_login(String id, String pwd) {

		String name = key + id;
		String password = key + pwd;

		String b64name = Base64Utils.getBase64(name);
		String b64pwd = Base64Utils.getBase64(password);

		Map<String, String> map = new TreeMap<String, String>();
		map.put("name", b64name);
		map.put("password", b64pwd);
		String request = JSON.toJSONString(map);
		return Bulid.Params(0, request);
	}

}
