package com.study.suit;

import org.testng.annotations.Test;

import com.study.dataprovider.LoginDataProvider;

public class LoginTest {
@Test(dataProvider = "login",dataProviderClass = LoginDataProvider.class)
public void login(){
	
}
}
