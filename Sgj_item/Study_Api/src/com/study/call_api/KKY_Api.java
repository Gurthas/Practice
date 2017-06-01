package com.study.call_api;

import com.study.settings.GlobalSettings;
import com.study.suit.HttpClientHelper;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class KKY_Api {
	// 发送验证码请求
	public static String requestVerfycode(String mobile, String sms_token, String sid)
			throws ProtocolException, IOException {
		String result = null;
		Map<String, String> params1 = new HashMap<String, String>();
		params1.put("mobile", mobile);
		params1.put("sms_token", sms_token);
		params1.put("sid", sid);
		result = HttpClientHelper.doPost(GlobalSettings.KkySmsUrl, params1);
		return result;

	}

	// 获取验证码
	public static String getVerifyCode(String mobile) {
		Map<String, String> params2 = new HashMap<String, String>();
		params2.put("mobile", mobile);
		String res2 = HttpClientHelper.doGet(GlobalSettings.VerifyCodeUrl, params2);
		String resp = res2.substring(res2.length() - 4, res2.length());
		System.out.println("验证码为"+resp);
		return resp;
		
	}
	// 登录
	public static String kkyLogin(String mobile, String code, String user_token, String device_token, String rdid,
			String bb) throws ProtocolException, IOException {
		Map<String, String> params3 = new HashMap<String, String>();
		params3.put("mobile", mobile);
		params3.put("code", code);
		params3.put("user_token", user_token);
		params3.put("devide_token", device_token);
		params3.put("rdid", rdid);
		params3.put("bb", bb);
		String result = HttpClientHelper.doPost(GlobalSettings.KkyLogin, params3);
		return result;

	}

}
