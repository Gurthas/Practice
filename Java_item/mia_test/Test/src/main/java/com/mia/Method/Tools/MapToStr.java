package com.mia.Method.Tools;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.mia.data.Constant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MapToStr {
	// private static String secret = Constant.secret;
	private static Logger log = LogManager.getLogger("MapToStr");

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
			log.error("从map中转换为字符串失败");
			log.error(e.getMessage());
		}

		return str;
	}

	public static String setStrFromMap(Map<String, String> map) {
		String secret = Constant.secret;
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
			log.error("从map中转换为字符串失败");
			log.error(e.getMessage());
		}

		return str;
	}

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("ac", "a");
		map.put("ab", "b");
		System.out.println(setStrFromMap(map));

	}
}
