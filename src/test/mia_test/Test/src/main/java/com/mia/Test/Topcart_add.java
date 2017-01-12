package com.mia.Test;

import java.util.Map;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.mia.Method.ConnectParam;
import com.mia.Method.Method;
import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;
import com.mia.Method.Tools.JsonParse;
import com.mia.data.Constant;
import com.mia.data.Data;
import com.mia.Report.TestReport;
import com.mia.Report.Testreportlog;

@Listeners({ TestReport.class })
// @Test(dataProvider="Dataparams" ,dataProviderClass = Data.class)
public class Topcart_add {

	private static String request;
	private static String params;
	private static Map<String, String> map = new TreeMap<String, String>();

	/*
	 * 定义加车接口， 传参后输出请求体
	 */
	public static String add(String item_id, String item_size, String i) {

		Map<String, String> map = new TreeMap<String, String>();
		map.put("item_id", item_id);
		map.put("item_size", item_size);
		map.put("quantity", i);
		String request = Bulid.Params(1, JSON.toJSONString(map));
		//String url = Constant.url + "topcart/add";
		String response = Httpclient.sendHttpPost("topcart/add", request);
		return JsonParse.code(response);

	}

	@BeforeTest
	public static void befortest() {

		System.out.println("测试开始执行了");
	}

	@Test(dataProvider = "Dataparams", dataProviderClass = Data.class)
	public static void add_test(String case_id, String case_name, String url, String param, String result,
			String C_param, String flag, String cart) {

		if (flag.equals("Y")) {
			params = Method.JsonParam(ConnectParam.GetParam(param, map));
		} else {
			params = Method.JsonParam(param);
		}
		try {
			request = Bulid.Params(1, params);
		} catch (Exception e) {
			System.err.println("参数构建失败");
		}
		String response = Httpclient.sendHttpPost(url.toString(), request);

		if (C_param != "")
			ConnectParam.SetParam(C_param, response, map);
		String code = (Method.Param_find(response, "code", ",\""));
		code = "code " + code;
		if (code.equals(result))
			map.put(case_id, "done");
		System.out.println("map的信息是：" + map);
		Testreportlog.log(case_id, case_name, url, params, result, response);
		Assert.assertEquals(code, result);
	}

	@AfterTest
	public static void aftertest() {
		System.out.println("测试结束了");
		map.clear();
	}
}
