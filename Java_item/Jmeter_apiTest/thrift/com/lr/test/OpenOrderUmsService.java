package com.lr.test;
import org.apache.thrift.TException;

import com.mia.OpenOrder.CommonParams;
import com.mia.OpenOrder.TOrderUmsService;
import com.mia.OpenOrder.TParamsCancelOrderForBackEndSystem;
import com.mia.OpenOrder.TParamsCancelOrderItemForBackEndSystem;
import com.mia.OpenOrder.TParamsOpenOrderCreate;
import com.mia.OpenOrder.TParamsPing;
import com.mia.OpenOrder.TResultCancelOrder;
import com.mia.OpenOrder.TResultOpenOrderCreate;
import com.mia.OpenOrder.TResultPing;


public class OpenOrderUmsService implements TOrderUmsService.Iface {

	@Override
	public TResultCancelOrder cancelOrderForBackEndSystem(TParamsCancelOrderForBackEndSystem params,
			CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultCancelOrder cancelVirtualOrderForBackEndSystem(TParamsCancelOrderForBackEndSystem params,
			CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultCancelOrder cancelOrderItemForBackEndSystem(TParamsCancelOrderItemForBackEndSystem params,
			CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultOpenOrderCreate openOrderCreate(TParamsOpenOrderCreate params, CommonParams cParams)
			throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultPing ping(TParamsPing param) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

}
