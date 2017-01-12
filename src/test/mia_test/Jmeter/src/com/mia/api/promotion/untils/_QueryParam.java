package com.mia.api.promotion.untils;

import java.util.ArrayList;
import java.util.List;

import com.mia.api.promotion.QueryParam;

public class _QueryParam {

	public static QueryParam params(String param) {

		QueryParam params = new QueryParam();

		params.setRequestTime(requestTimestamp());
		params.setVersion("4.9");
		params.setClientType("api");
		List<Integer> businessIds = new ArrayList<Integer>();
		param = param.replace("，", ",");
		String[] maptxt = param.split(",");
		for (int i = 0; i < maptxt.length; i++) {
			String key = maptxt[i];
			businessIds.add(Integer.valueOf(key));
		}
		// businessIds.add(0,1000076);
		// businessIds.add(1,1000077);
		params.setBusinessIds(businessIds);
		return params;
	}

	public static int requestTimestamp() {
		long seconds = System.currentTimeMillis();
		return (int) seconds;
	}
}
