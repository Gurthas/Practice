package com.httpclientPractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

public class TestGetVerifyCode {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String url1 = "http://dev.shark.kuaikuaiyu.com/api.login.sms?version=0,17&distribution=nightly";

		Map<String, String> data = new HashMap<String, String>();
		data.put("mobile", "15011431186");
		data.put("sms_token", HttpclientUtil1.toTime());
		data.put("sid", "haode");
		String res = HttpclientUtil1.doPost(url1, data);
		System.out.println(res);

		String url2 = "http://dev.shark.kuaikuaiyu.com/debug.code.query";
		Map<String, String> params = new HashMap<String, String>();
		params.put("mobile", "15011431186");
		String res2 = HttpclientUtil1.doGet(url2, params);
		String resp = res2.substring(res2.length()-4, res2.length());
		System.out.println(resp);

	}
}
