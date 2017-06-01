package com.lr.test;

import com.mia.OpenOrder.TOpenOrders;
import com.mia.OpenOrder.TParamsOpenOrderCreate;

public class ParamsOpenOrderCreate {
	public static TParamsOpenOrderCreate params(){
		TParamsOpenOrderCreate params = new TParamsOpenOrderCreate();
		TOpenOrders openOrders = OpenOrders.params();
		params.setOpenOrders(openOrders);
		

	    //System.out.println("QueryUserCoupon " + params);
	    return params;
		
	}
}
