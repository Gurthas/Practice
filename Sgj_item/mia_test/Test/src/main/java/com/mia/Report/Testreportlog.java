package com.mia.Report;

import org.testng.Reporter;

public class Testreportlog {
	public static void log(String case_id, String case_name, String url, String params, String result,
			String response) {
		Reporter.log(case_id);
		Reporter.log(case_name);
		Reporter.log(url);
		Reporter.log(params);
		Reporter.log(result);
		Reporter.log(response);
		// CodeAssert.code(response, result);

	}
}
