package com.lr.test;

import com.mia.CannelOrder.TParamsCancelOrder;


public class ParamsCancelOrder {
	public static TParamsCancelOrder Params(){
	TParamsCancelOrder params = new TParamsCancelOrder();
    params.setUserId(5494164);
    params.setSuperiorOrderCode("1111111111111111111");

    System.out.println("QueryUserCoupon " + params);
    return params;
	}
	public static void main(String[] args) {
		System.out.println(Params());
	}
}
