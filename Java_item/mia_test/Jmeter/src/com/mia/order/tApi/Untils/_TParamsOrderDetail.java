package com.mia.order.tApi.Untils;

import com.mia.order.tApi.TParamsOrderDetail;

public class _TParamsOrderDetail {

	public static TParamsOrderDetail params(int UserID, String OrderCode) {
		TParamsOrderDetail params = new TParamsOrderDetail();
		params.setUserId(UserID);
		params.setOrderCode(OrderCode);
		return params;

	}

	public static void main(String[] args) {
		System.out.println(params(1, "123"));
	}
}
