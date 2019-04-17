package com.mia.Method.Param;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

import com.mia.data.Constant;
import com.mia.Encrypt.RsaUtils;

public class PublicParam {
	private static String uid;
	private static String sessionid;
	private static String seconds;

	public static Map<String, String> mapparam(int loginFlag, String params) {
		uid = uuid();
		sessionid = sessionid();
		seconds = seconds();
		Map<String, String> map = new TreeMap<String, String>();
		map.put("app_id", Constant.app_id);
		map.put("dvc_id", uid);
		map.put("regid", uid);
		map.put("session", sessionid);
		map.put("timestamp", seconds);
		map.put("version", Constant.versionId);
		//1为登录状态
		if (loginFlag == 1) {
			map.put("auth_session", Constant.auth_session);
		} else {
			map.put("auth_session", "");
		}
		if (!params.equals("") || params == null)
			map.put("params", RsaUtils.rsa(params));

		return map;

	}

	private static String uuid() {

		String s = UUID.randomUUID().toString();
		StringBuffer uuid = new StringBuffer();
		uuid.append("miatest").append(s, 0, 8).append(s, 9, 13).append(s, 14, 18).append(s, 19, 23).append(s, 24, 36);
		return uuid.toString();
	}

	private static String sessionid() {
		String base = "0123456789";
		long seconds = System.currentTimeMillis();
		Random random = new Random();
		StringBuffer sessionid = new StringBuffer();
		sessionid.append(seconds);
		for (int i = 0; i < 5; i++) {
			int number = random.nextInt(base.length());
			sessionid.append(base.charAt(number));
		}

		return sessionid.toString();
	}

	private static String seconds() {
		long seconds = System.currentTimeMillis() / 1000;
		StringBuffer res = new StringBuffer();
		return res.append(seconds).toString();

	}

	public static void main(String[] args) {
		System.out.println(mapparam(1, ""));
	}

}
