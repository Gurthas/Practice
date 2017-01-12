package com.mia.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mia.Method.ConnectParam;
import com.mia.Method.MapData;
import com.mia.Method.Method;
import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;
import com.mia.Method.Tools.JsonParse;
import com.mia.Report.TestReport;
import com.mia.Report.Testreportlog;

@Listeners({ TestReport.class })
public class TestCase {
	private static Logger log = LogManager.getLogger("TestCase");
	private static Map<String, String> Map = new TreeMap<String, String>();
	private static String request;
	private static String params;

	@Test(dataProvider = "DataParam", dataProviderClass = MapData.class)
	// public static void Test(String Path, int id){
	public static void Test(ArrayList<String> value) {
		System.out.println(value);
		String case_id = value.get(0);
		String case_name = value.get(1);
		for (int i = 2; i < value.size(); i++) {
			if (value.get(i + 4).equals("Y")) {
				params = Method.JsonParam(ConnectParam.GetParam(value.get(i + 1), Map));
			} else {
				params = Method.JsonParam(value.get(i + 1));
			}
			try {
				request = Bulid.Params(1, params);
			} catch (Exception e) {

				log.info("参数构建失败： " + params);
			}
			String response = Httpclient.sendHttpPost(value.get(i).toString(), request);
			log.info("响应结果： " + response);

			if (value.get(i + 3) != "")
				ConnectParam.SetParam(value.get(i + 3), response, Map);

			String code = JsonParse.code(response);
			code = "code " + code;

			if (code.equals(value.get(i + 2)))
				Map.put(case_id, "done");

			String resiltcode = "预期测试结果：" + value.get(i + 2) + "\n" + "实际测试结果：" + code;
			Testreportlog.log(case_id, case_name, value.get(i), params, resiltcode, response);
			Assert.assertEquals(code, value.get(i + 2));
			i = i + 5;

		}

	}
}
