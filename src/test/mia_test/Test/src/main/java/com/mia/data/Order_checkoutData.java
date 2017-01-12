package com.mia.data;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.mia.DB.SqlUtils;

public class Order_checkoutData {
	private static Object[][] obj;

	@DataProvider(name = "checkout")
	public static Object[][] checkout() {
		// name='item/info' and
		List<Map<String, Object>> params = null;
		String sql1 = "select id ,name ,params ,result from  test_case  where   name='order/checkout' and is_test =1";
		params = SqlUtils.select(sql1);
		if (params.size() > 0) {
			obj = new Object[params.size()][];
			for (int i = 0; i < params.size(); i++) {
				Map<String, Object> map = params.get(i);
				System.out.println(map.get("name"));
				obj[i] = new Object[] { map.get("name"), map.get("params"), map.get("result") };

			}

			return obj;
		}
		return null;

	}
}
