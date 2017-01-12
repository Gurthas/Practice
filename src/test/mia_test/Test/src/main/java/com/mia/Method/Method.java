package com.mia.Method;

import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;

public class Method {

	private static Logger log = LogManager.getLogger("Method");

	// 关联方法：result 传参信息，默认为响应结果， LB为查找json数组KEY
	public static String Param_find(String result, String LB, String RB) {
		String code = "";
		try {
			code = result.substring(result.indexOf(LB) + LB.length(), result.indexOf(RB, result.indexOf(LB)));
			code = code.replace("\"", "").replace(":", "").replace(",", "");
			return code;
		} catch (Exception e) {
			log.info("无法匹配相关数据，响应信息有误");
			return null;
		}

	}

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
			return null;
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
		try {
			if (channel.equals("IOS")) {

				secret = "MIYABABY_IOS";
			} else if (channel.equals("ANDROID")) {

				secret = "MIYABABY_ANDROID";
			} else {
				secret = "MIYABABY_ANDROID";
				log.info("获取秘钥失败，无法判断测试终端，请确认初始化是否成功，请求退出");
				System.exit(0);
			}
		} catch (Exception e) {
			log.info("获取秘钥失败，无法判断测试终端，请确认初始化是否成功");
			System.exit(0);
		}

		return secret;
	}

	// 数据解析 数据格式(String txt= "item_id,1454284,type,item,cart,,good";) 然后转json
	// 标点符号首先被替换，防止无法识别
	public static String JsonParam(String txt) {
		if (txt.equals(null) == false) {
			if (txt.equals("{}"))
				return "{}";
			txt = txt.replace("，", ",");
			String[] maptxt = txt.split(",");
			String key;
			String value;
			Map<String, String> map = new TreeMap<String, String>();

			for (int i = 0; i < maptxt.length; i++) {
				if (i < (maptxt.length - 1)) {
					key = maptxt[i];
					i++;
					value = maptxt[i];
					map.put(key, value);
				} else {
					key = maptxt[i];
					value = "";
					map.put(key, value);
					break;
				}
			}

			String json = JSON.toJSONString(map);
			log.info("\n " + "************业务参数**********\n" + json + "\n " + "************业务参数**********");
			return json;
		} else {
			return null;
		}
	}

}
