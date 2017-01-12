package com.mia.Method;

import java.util.ArrayList;
import java.util.Map;

import com.mia.Method.Tools.RegexUntil;

public class ConnectParam {

	public static void SetParam(String C_param, String response, Map<String, String> map) {

		ArrayList<String> List = new ArrayList<String>();
		C_param = C_param.replace("，", ",");
		String[] maptxt = C_param.split(",");
		for (int i = 0; i < maptxt.length; i++) {
			String key = maptxt[i];
			List = RegexUntil.regexList(maptxt[i + 1], maptxt[i + 2], response);
			String value = List.get(0).replace("\"", "").replace(":", "");
			map.put(key, value);
			i = i + 2;
			System.out.println(i);
		}
	}

	public static String GetParam(String param, Map<String, String> map) {
		ArrayList<String> List = new ArrayList<String>();
		String params = null;
		if (param != null) {
			try {
				List = RegexUntil.regexList("{", "}", param);
				for (int i = 0; i < List.size(); i++) {
					String paramvalue = map.get(List.get(i));
					params = param.replace("{" + List.get(i) + "}", paramvalue);
					map.remove(List.get(i));
				}
			} catch (Exception e) {
				return param;
			}
		}
		return params;
	}
}
