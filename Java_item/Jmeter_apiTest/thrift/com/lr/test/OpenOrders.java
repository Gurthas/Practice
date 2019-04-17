package com.lr.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mia.OpenOrder.TOpenOrderItem;
import com.mia.OpenOrder.TOpenOrders;

public class OpenOrders {
	
	public static TOpenOrders params(){
		TOpenOrders params = new TOpenOrders();
		params.setChannel((short) 99);
		params.setDstAddress("123");
		params.setDstArea("123");
		params.setDstCity("123");
		params.setDstCode("200");
		params.setDstMobile("18201049123");
		params.setDstMode((short) 1);
		params.setDstMobile("18201049123");
		params.setDstName("123");
		params.setDstProvince("123");
		params.setDstStreet("123");
		params.setIp("127.0.0.1");
		params.setIsLockOrder(false);
		params.setIsMinusStock(false);
		params.setIsUseThirdOrderCode(false);				
		params.setIsZeroOrder(false);
		TOpenOrderItem Itemparam = OpenOrderItem.params();
		List<TOpenOrderItem> orderItemList = new ArrayList<TOpenOrderItem>();
		//List<TOpenOrderItem> orderItemList = new ArrayList<TOpenOrderItem>();
		orderItemList.add(0,Itemparam);
		params.setOrderItemList(orderItemList);
		
		return params;
		
	}
}
