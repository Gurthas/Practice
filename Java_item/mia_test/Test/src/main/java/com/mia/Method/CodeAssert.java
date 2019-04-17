package com.mia.Method;

import org.testng.Assert;

import com.mia.Method.Method;

public class CodeAssert {

	public static void code(String response, String result) {

		String code = (Method.Param_find(response, "code", ",\""));
		code = "code " + code;
		Assert.assertEquals(code, result);
	}

}
