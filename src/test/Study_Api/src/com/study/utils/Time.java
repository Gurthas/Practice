package com.study.utils;

public class Time {
	public static String toStrTime() {
		/*long lTime = System.currentTimeMillis();
		String strTime = String.valueOf(lTime);
		return strTime;*/
		String s = String.valueOf(System.currentTimeMillis());
		return s;
	}
}
