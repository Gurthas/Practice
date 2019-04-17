package com.study.call_api;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.openqa.selenium.remote.JsonException;

import com.study.settings.GlobalSettings;
import com.study.suit.HttpClientHelper;

//实现注册接口
public class Common_API {
	public static String signup(String userName, String password) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("mobile", userName);
		params.put("password", password);
		String result = null;
		try {
			result = HttpClientHelper.doPost(GlobalSettings.signupW, params);
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static String login(String userName, String password) throws ClientProtocolException, IOException {

		Map<String, String> params = new HashMap<String, String>();

		try {
			params.put("mobile", userName);
			params.put("password", password);
		} catch (JsonException e) {
			e.printStackTrace();
		}
		String result = HttpClientHelper.doPost(GlobalSettings.loginW, params);
		return result;

	}

}
