package com.study.suit;

import java.io.IOException;
import java.net.ProtocolException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.study.call_api.Common_API;
import com.study.call_api.KKY_Api;
import com.study.dataprovider.SunDataProvider;


public class SunTest {
/*@Test(dataProvider = "signup",dataProviderClass = SunDataProvider.class)
public void signup(String userName,String password) throws ClientProtocolException, IOException{
	String response = null;
	response = Common_API.signup(userName, password);
	JSONObject obj = new JSONObject(response);
	Assert.assertEquals(obj.get("flag"),"ok","sign up is not sucessed");		 
}

@Test(dataProvider = "login",dataProviderClass = SunDataProvider.class)
public void login(String userName,String password) throws ClientProtocolException, IOException{
	String response = null;
	response = Common_API.login(userName, password);
	JSONObject obj = new JSONObject(response);
	Assert.assertEquals(obj.get("flag"),"ok","login is not sucessed");	
}*/

@Test(dataProvider = "requestVerifyCode",dataProviderClass = SunDataProvider.class)
public void requestVerifyCode(String mobile, String sms_token, String sid) throws ProtocolException, IOException{
	String response = null;
	response = KKY_Api.requestVerfycode(mobile, sms_token, sid);	
	JSONObject obj = new JSONObject(response);
	Assert.assertEquals(obj.get("flag"),"ok","fail to request verify_code!!");
}

@Test(dependsOnMethods = {"requestVerifyCode"},dataProvider = "getVerifyCode",dataProviderClass = SunDataProvider.class)
public void getVerifyCode(String mobile){
	String response = null;
	response = KKY_Api.getVerifyCode(mobile);
	Assert.assertNotNull(response);
}

}
