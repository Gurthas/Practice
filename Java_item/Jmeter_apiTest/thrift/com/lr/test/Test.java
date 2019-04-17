package com.lr.test;

import com.mia.OpenOrder.CommonParams;
import com.mia.OpenOrder.TParamsOpenOrderCreate;




public class Test {


	public static void main(String[] args) {
		//CouponApiService couponApiService = new CouponApiService();
		Client client = new Client();
		
		CommonParams commonParams = ComParams.CommonParams();
		TParamsOpenOrderCreate params = ParamsOpenOrderCreate.params();
	
		client.StartClient(params,commonParams);

	}
}
