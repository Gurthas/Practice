package com.mia.Method;

import java.util.ArrayList;
import java.util.Map;

import java.util.TreeMap;

import org.testng.annotations.DataProvider;

import com.mia.Excle.PoiExcelHelper;
import com.mia.Excle.PoiExcelUtils;

public class MapData {

	private static Object[][] obj;

	// @Parameters({ "Path", "id" })
	@DataProvider
	public static Object[][] DataParam() {
		// public static Map<String, ArrayList<String>> Map(String Path ,int
		// sheetid){
		String Path = "c:/测试数据.xlsx";
		int sheetid = 2;
		PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(Path);
		ArrayList<ArrayList<String>> dataList = helper.readExcel(Path, sheetid);
		ArrayList<String> dataLists = new ArrayList<String>();
		ArrayList<String> List = new ArrayList<String>();

		Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();

		for (int i = 1; i < dataList.size(); i++) {
			List = dataList.get(i);
			if (List.get(0) == "") {
				List.set(0, dataList.get(i - 1).get(0));
				List.set(1, dataList.get(i - 1).get(1));
			}
		}
		for (int i = 1; i < dataList.size(); i++) {
			if (map.get(dataList.get(i).get(0)) != null) {
				dataLists = map.get(dataList.get(i).get(0));
				String key = dataList.get(i).get(0);
				dataList.get(i).remove(0);
				dataList.get(i).remove(0);
				for (String s : dataList.get(i)) {
					dataLists.add(s);
				}
				map.put(key, dataLists);

			} else {
				map.put(dataList.get(i).get(0), dataList.get(i));

			}
		}

		obj = new Object[map.size()][];
		int i = 0;
		for (ArrayList<String> value : map.values()) {
			obj[i] = new Object[] { value };
			i++;
		}
		return obj;

	}
}
