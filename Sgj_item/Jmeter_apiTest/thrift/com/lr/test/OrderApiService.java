package com.lr.test;

import org.apache.thrift.TException;

import com.mia.CannelOrder.CommonParams;
import com.mia.CannelOrder.TOrderApiService;
import com.mia.CannelOrder.TParamsCancelOrder;
import com.mia.CannelOrder.TParamsCancelOrderBackActLimit;
import com.mia.CannelOrder.TParamsGetRedisValue;
import com.mia.CannelOrder.TParamsPing;
import com.mia.CannelOrder.TParamsSetRedisValue;
import com.mia.CannelOrder.TResultCancelOrder;
import com.mia.CannelOrder.TResultCancelOrderBackActLimit;
import com.mia.CannelOrder.TResultGetRedisCom;
import com.mia.CannelOrder.TResultPing;
import com.mia.CannelOrder.TResultSetRedisCom;

public class OrderApiService implements TOrderApiService.Iface {

	@Override
	public TResultCancelOrderBackActLimit cancelOrderBackActLimit(TParamsCancelOrderBackActLimit params,
			CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultCancelOrder cancelOrder(TParamsCancelOrder params, CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultCancelOrder cancelVirtualOrder(TParamsCancelOrder params, CommonParams cParams) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultPing ping(TParamsPing params) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultSetRedisCom setRedisValue(TParamsSetRedisValue params) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public TResultGetRedisCom getRedisValue(TParamsGetRedisValue params) throws TException {
		// TODO 自动生成的方法存根
		return null;
	}

}
