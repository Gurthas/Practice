package com.mia.order.tApi.Untils;

import com.mia.order.tApi.TParamsOrderList;

public class _TParamsOrderList {
	public static TParamsOrderList params(int userId, int page, int pageSize, int type, int status, int clientSource) {
		TParamsOrderList params = new TParamsOrderList();
		params.setUserId(userId);
		params.setPage(page);
		params.setPageSize(pageSize);
		params.setType(type);
		params.setStatus(status);
		params.setClientSource(clientSource);
		return params;

	}
}
