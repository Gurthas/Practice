package com.mia.data;

import java.sql.SQLException;
import java.util.ArrayList;

import org.testng.annotations.Parameters;

import com.mia.DB.*;
import com.mia.Excle.PoiExcelHelper;
import com.mia.Excle.PoiExcelUtils;

public class excleRead {
	/*
	 * 新数据插入
	 */
	@Parameters("path")
	public static void Read(String path) {
		PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(path);

		// 读取excel文件数据 得到第一个ArrayList，即整个sheet页内容
		ArrayList<ArrayList<String>> dataList = helper.readExcel(path, 2);

		ArrayList<String> List = new ArrayList<String>();
		System.out.println(dataList);
		// Object params[][] = new Object[dataList.size()][];

		for (int i = 1; i < dataList.size(); i++) {

			List = dataList.get(i);
			if (List.get(0) == "")
				List.set(0, dataList.get(i - 1).get(0));
			if (List.get(1) == "")
				List.set(1, dataList.get(i - 1).get(1));
			// List.remove(0);
			String sql = "INSERT INTO test_case(case_id,case_name,name,params,result,C_param) VALUES(?,?,?,?,?,?)";

			SqlUtils.update(sql, List.toArray());
		}

	}

	public static ArrayList<String> ReadList(String filePath) {
		PoiExcelHelper helper = PoiExcelUtils.getPoiExcelHelper(filePath);

		// 读取excel文件数据 得到第一个ArrayList，即整个sheet页内容
		ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, 2);
		ArrayList<String> ListParams = new ArrayList<String>();
		ArrayList<String> List = new ArrayList<String>();
		if (dataList.size() > 0) {

			for (int i = 1; i < dataList.size(); i++) {
				ArrayList<String> map = dataList.get(i);
				if (map.get(0) != "" && i > 1) {
					ListParams.add(List.toString());
					List.clear();
				}
				List.addAll(map.subList(2, 5));
				if (i == (dataList.size() - 1)) {
					ListParams.add(List.toString());
					break;
				}
			}

		}
		return ListParams;

	}

	public static void main(String[] args) {
		String path = "c:/测试数据.xlsx";
		Read(path);
	}

}
