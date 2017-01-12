package com.mia.test;

import java.util.Map;
import java.util.Map.Entry;

public class MapToStr {

	/**
	 * 把map表转换为字符串，使用= 和&连接
	 * 
	 * @param map
	 * @return String
	 */
	public static String getStrFromMap(Map<String, String> map) {
		String str = "";
		try {
			for (Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				str += key + "=" + value + "&";
			}
			str = str.substring(0, str.length() - 1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}

	public static String setStrFromMap(Map<String, String> map, String app) {
		String secret = "";

		if (app.equals("IOS")) {

			secret = "MIYABABY_IOS";
		} else {

			secret = "MIYABABY_ANDROID";
		}
		String str = "";
		try {
			for (Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				str += key + value;
			}
			str = str.substring(0, str.length());
			str = str + secret;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}

}
