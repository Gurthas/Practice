package com.study.dataprovider;

import org.testng.annotations.DataProvider;
import com.study.testdata.TestData;

public class SunDataProvider {

	@DataProvider(name = "signup")
	public static Object[][] signup() {
		return new Object[][] { 
			{ "15015431222", "123456" }, 
			{ "13611901234", "123456" }, 
			{ "13588123456", "123456" } };

	}

	@DataProvider(name = "login")
	public static Object[][] login() {
		return new Object[][] { 
			{ "13901234567", "123456" }};
	}
}
