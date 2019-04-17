package com.mia.order.tApi.Untils;

import java.util.UUID;

import com.mia.order.tApi.CommonParams;

public class _CommonParams {
	public static CommonParams params(String appVersion) {
		CommonParams commonParams = new CommonParams();
		commonParams.setRequestId(requestId());
		commonParams.setClientVersion("2_0");
		commonParams.setServiceVersion("2_0");
		commonParams.setAppVersion(appVersion);
		commonParams.setRequestTimestamp(requestTimestamp());
		
		return commonParams;

	}

	public static String requestId() {
		String s = UUID.randomUUID().toString();
		s = s.replace("-", "");
		return s;
	}

	public static double requestTimestamp() {
		long seconds = System.currentTimeMillis()/100;
		return (double) seconds;
	}
}
