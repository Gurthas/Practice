package com.mia.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class TestCase {

	private static String key = "miababy";

	public static String account_login(String id, String pwd, String app_id, String versionId) throws Exception {

		String name = key + id;
		String password = key + pwd;
		String b64name = Base64Utils.getBase64(name);
		String b64pwd = Base64Utils.getBase64(password);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", b64name);
		map.put("password", b64pwd);
		String json = JSON.toJSONString(map);
		System.out.println(json);
		String requests = Bulid.Params(0, json, app_id, versionId, "");
		return requests;

		// return request;
	}

	/*
	 * map 业务参数map app 业务渠道：ANDROID IOS flag 登录标志信息：1登录 0未登录 auth_session
	 * 用户登录session信息，若flag为0，则传空 versionId api版本号
	 */
	public static String request(Map<String, String> map, String app, int flag, String auth_session, String versionId)
			throws Exception {
		String json = JSON.toJSONString(map);
		String requests = Bulid.Params(flag, json, app, versionId, auth_session);
		return requests;

	}

	public static void main(String[] args) {

		try {
			System.out.println(account_login("18201049123", "123456", "IOS", "5_0_0"));
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
