package com.study.dataprovider;

import org.testng.annotations.DataProvider;

import com.study.call_api.KKY_Api;
import com.study.testdata.TestData;
import com.study.utils.Time;

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
	//kky请求获取验证码参数
	@DataProvider(name = "requestVerifyCode")
	public static Object[][] requestVerifyCode(){
		return new Object[][]{
			{"15011431111",Time.toStrTime(),"test"}
		};
		
	}
	//kky获取验证码参数
	@DataProvider(name = "getVerifyCode")
	public static Object[][] getVerifyCode(){
		return new Object[][]{
			{"15011431111"}
			
		};
	}
	@DataProvider(name = "kkyLogin")
	public static Object[][] kkyLogin(){
		return new Object[][]{
			{"15011431111",KKY_Api.getVerifyCode("15011431111"),"test","test","test","black_box"},
		};
		
	}
}
