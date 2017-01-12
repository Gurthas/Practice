package com.mia.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.mia.DB.SqlUtils;
import com.mia.Excle.PoiExcelHelper;
import com.mia.Excle.PoiExcelUtils;

public class Data {
	private static Object[][] obj;

	@DataProvider(name = "DataParam")
	public static Object[][] DataParam() {
		// name='item/info' and
		List<Map<String, Object>> params = null;
		String sql1 = "select case_id,case_name,name,params,result,C_param from  test_case  where   is_test =1";
		params = SqlUtils.select(sql1);
		if (params.size() > 0) {
			obj = new Object[params.size()][];
			for (int i = 0; i < params.size(); i++) {
				Map<String, Object> map = params.get(i);
				System.out.println(map.get("name"));
				obj[i] = new Object[] { map.get("case_id"), map.get("case_name"), map.get("name"), map.get("params"),
						map.get("result"), map.get("C_param") };

			}

			return obj;
		}
		return null;

	}

	@DataProvider(name = "Dataparams")
	public static Object[][] Dataparams() {
		String path = "c:/测试数据.xlsx";
		PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(path);
		ArrayList<ArrayList<String>> dataList = helper.readExcel(path, 2);

		ArrayList<String> List = new ArrayList<String>();

		Object[][] result = new Object[dataList.size()][];
		for (int i = 1; i < dataList.size(); i++) {
			List = dataList.get(i);

			if (List.get(0) == "")
				List.set(0, dataList.get(i - 1).get(0));
			if (List.get(1) == "")
				List.set(1, dataList.get(i - 1).get(1));
			// System.out.println("第一位数据：" +List.get(1));

			result[i] = new Object[] { List.get(0), List.get(1), List.get(2), List.get(3), List.get(4), List.get(5),
					List.get(6), List.get(7) };
		}
		return result;

	}
}
