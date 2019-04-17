package com.lr.test;

import java.util.ArrayList;
import java.util.List;

import com.mia.OpenOrder.TOpenOrderItem;

public class OpenOrderItem {
	public static TOpenOrderItem params(){
		TOpenOrderItem params = new TOpenOrderItem();
		params.setItemId(123456);
		params.setItemSize("Single");
		params.setQuantity(1);
		params.setItemPayPrice(123);
		params.setItemShipPrice(124);		
		params.setItemTaxPrice(126);
	    System.out.println("QueryUserCoupon " + params);
	    return params;
		
	}
	public static void main(String[] args) {
		System.out.println(params().toString());
		List<TOpenOrderItem> orderItemList = new ArrayList<TOpenOrderItem>();
		orderItemList.add(0,params());
		System.out.println("orderItemList："  + orderItemList);
	}
}
