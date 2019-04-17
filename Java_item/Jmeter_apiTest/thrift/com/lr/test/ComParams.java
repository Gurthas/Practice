package com.lr.test;

import java.util.UUID;

import com.mia.OpenOrder.CommonParams;

public class ComParams {
	private static  String appVersion = "4_8_0";
	public static String requestId(){
		String s = UUID.randomUUID().toString();
		s = s.replace("-", "");
		return s;
		}
	
	public static double requestTimestamp(){
		  long  seconds = System.currentTimeMillis(); 
		  return (double)seconds;		
	}

	public static CommonParams CommonParams(){
	    CommonParams commonParams = new CommonParams();       
        commonParams.setRequestId(requestId());
        commonParams.setClientVersion("2_0");
        commonParams.setServiceVersion("2_0");
        commonParams.setAppVersion(appVersion);
        commonParams.setRequestTimestamp(requestTimestamp());
        System.out.println("commonParams :   \n" + commonParams);
		return commonParams;	
	}
}
