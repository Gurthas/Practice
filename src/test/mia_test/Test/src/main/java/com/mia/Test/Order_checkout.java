package com.mia.Test;

import java.util.Map;
import java.util.TreeMap;

import org.testng.Reporter;

import com.alibaba.fastjson.JSON;
import com.mia.Method.CodeAssert;
import com.mia.Method.Method;
import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;
import com.mia.data.Constant;

public class Order_checkout {

	private static String request;
	private static String params;

	// @Test(dependsOnMethods = { "add"
	// },dataProvider="checkout",dataProviderClass = Order_checkoutData.class)
	public static String checkout() {
		request = Bulid.Params(1, "{}");
		//String url = Constant.url + "order/checkout";
		String response = Httpclient.sendHttpPost("order/checkout", request);
		return response;

	}
	public static void checkout(String url, String param, String result) {
		params = Method.JsonParam(param);

		request = Bulid.Params(1, params);
	
		String response = Httpclient.sendHttpPost(url.toString(), request);

		Reporter.log(url);
		Reporter.log(param);
		Reporter.log(result);
		Reporter.log(response);
		CodeAssert.code(response, result);

	}

	/*
	 * 定义checkout接口， 传参后输出请求体
	 */
	public static String checkout(String warehouse_id, String address_id, String redbag_id, String coupon_code) {
		String request = "{}";
		Map<String, String> map = new TreeMap<String, String>();
		map.put("warehouse_id", warehouse_id);
		map.put("address_id", address_id);
		map.put("redbag_id", redbag_id);
		map.put("coupon_code", coupon_code);
		if (warehouse_id != null || address_id != null || redbag_id != null || coupon_code != null)
			request = JSON.toJSONString(map);
		return Bulid.Params(0, request);
	}
}
