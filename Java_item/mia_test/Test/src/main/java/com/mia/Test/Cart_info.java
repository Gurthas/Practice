package com.mia.Test;

import com.mia.Method.Http.Httpclient;
import com.mia.Method.Param.Bulid;
import com.mia.Method.Tools.JsonParse;


public class Cart_info {
	public static String info(){
 
		String response = Httpclient.sendHttpPost("cart/info", Bulid.Params(1, ""));

		String code = JsonParse.code(response, "code");
		if(code.equals("200")){
			return response;
		}else{
		return "null";
		}
	}
}
