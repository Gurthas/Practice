package com.mia.test;

public class Method {

	// 大小写转换
	public static String Transform(String str) {

		StringBuffer sb = new StringBuffer();
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isUpperCase(c)) {
					sb.append(Character.toLowerCase(c));
				} else if (Character.isLowerCase(c)) {
					sb.append(Character.toUpperCase(c));
				}
			}
			return sb.toString();
		} else {
			return "ios";
		}

	}

	// 时间转换
	public static String TimeStamp() {
		long seconds = System.currentTimeMillis() / 1000;
		String time = String.valueOf(seconds);
		return time;
	}

	// 测试秘钥
	public static String Secret(String channel) {
		String secret = "";
		if (channel.equals("IOS")) {
			secret = "MIYABABY_IOS";
		} else {
			secret = "MIYABABY_ANDROID";

		}
		return secret;

	}

}
