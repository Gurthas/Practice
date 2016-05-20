package com.study.dataprovider;

import org.testng.annotations.DataProvider;
import com.study.testdata.TestData;

public class LoginDataProvider {
	
@DataProvider(name = "login")
public static Object[] login(){
	return new Object[]{
		TestData.test_name_login
		};
	
	
}
}

