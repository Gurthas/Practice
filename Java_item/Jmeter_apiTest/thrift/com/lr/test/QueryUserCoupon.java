package com.lr.test;

import com.mia.Coupon.TParamsQueryUserCoupon;
import com.mia.Coupon.TUserCouponStatus;

public class QueryUserCoupon {
	
	public static TParamsQueryUserCoupon Params(){
	TParamsQueryUserCoupon params = new TParamsQueryUserCoupon();
    params.setPageNo(1);
    params.setPageSize(20);
    params.setUid(5494164);
    params.setStatus(TUserCouponStatus.NoUse);
    System.out.println("QueryUserCoupon " + params);
    return params;
	}

	
}
