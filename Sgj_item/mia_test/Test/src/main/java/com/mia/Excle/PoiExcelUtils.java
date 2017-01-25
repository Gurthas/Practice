package com.mia.Excle;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.gson.Gson;

public abstract class PoiExcelUtils {
	private static Logger log = LogManager.getLogger("PoiExcelTest");

	// *************************************************
	// ================以下为测试代码====================
	// *************************************************
	public static void main(String[] args) {
		// 获取Excel文件的sheet列表
		// log.info(testGetSheetList("c:/测试数据.xlsx"));

		// 获取Excel文件的第1个sheet的内容
		testReadExcel("c:/测试数据.xlsx", 2, 2);

		// 获取Excel文件的第2个sheet的第2、4-7行和第10行及以后的内容
		// testReadExcel("c:/测试数据.xlsx", 0, "2,4-6");

		// 获取Excel文件的第3个sheet中a,b,g,h,i,j等列的所有内容
		// testReadExcel("c:/测试数据.xlsx", 0, new String[] {"b","c"});

		// 获取Excel文件的第4个sheet的第2、4-7行和第10行及以后，a,b,g,h,i,j等列的内容
		// testReadExcel("c:/测试数据.xlsx", 0, "2,4-7,10-", new String[]
		// {"a","b","g","h","i","j"});
	}

	// 测试获取sheet列表
	public static ArrayList<String> testGetSheetList(String filePath) {
		PoiExcelHelper helper = getPoiExcelHelper(filePath);

		// 获取Sheet列表
		ArrayList<String> sheets = helper.getSheetList(filePath);

		return sheets;
		// 打印Excel的Sheet列表
		// printList(filePath, sheets);
	}

	// 测试Excel读取
	public static String testReadExcel(String filePath, int sheetIndex, int rowNum) {
		PoiExcelHelper helper = getPoiExcelHelper(filePath);

		// 读取excel文件数据 得到第一个ArrayList，即整个sheet页内容
		ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, sheetIndex);
		log.info(dataList);

		// 新建数组，获取不同的行
		ArrayList<String> List = new ArrayList<String>();
		for (int i = 0; i < dataList.size(); i++) {
			log.info(dataList.get(i));
		}

		List = dataList.get(1);
		// Gson gson = new Gson();

		log.info(List.get(3));
		log.info(List.get(3));
		String value = List.get(3);
		// System.out.println(List2.get(0));
		// printBody(dataList);
		return value;
	}

	// 测试Excel读取
	public static void testReadExcel(String filePath, int sheetIndex, String rows) {
		PoiExcelHelper helper = getPoiExcelHelper(filePath);

		// 读取excel文件数据
		ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, sheetIndex, rows);

		// 打印单元格数据
		// printBody(dataList);
	}

	// 按列读取数据后，转换为Json
	public static void testReadExcel(String filePath, int sheetIndex, String[] columns) {
		PoiExcelHelper helper = getPoiExcelHelper(filePath);

		// 读取excel文件数据
		ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, sheetIndex, columns);
		// String data[];
		// data= (String[])dataList.toArray(new String [dataList.size()]);
		// log.info(data);

		// 打印列标题
		// printHeader(columns);

		// 打印单元格数据
		// printBody(dataList);
	}

	// 测试Excel读取
	public static void testReadExcel(String filePath, int sheetIndex, String rows, String[] columns) {
		PoiExcelHelper helper = getPoiExcelHelper(filePath);

		// 读取excel文件数据
		ArrayList<ArrayList<String>> dataList = helper.readExcel(filePath, sheetIndex, rows, columns);

		// 打印列标题
		// printHeader(columns);

		// 打印单元格数据
		// printBody(dataList);
	}

	// 获取Excel处理类
	public static PoiExcelHelper getPoiExcelHelper(String filePath) {
		PoiExcelHelper helper;
		if (filePath.indexOf(".xlsx") != -1) {
			helper = new PoiExcel2k7Helper();
		} else {
			helper = new PoiExcel2k3Helper();
		}
		return helper;
	}

	// 打印Excel的Sheet列表
	private static void printList(String filePath, ArrayList<String> sheets) {
		System.out.println();
		for (String sheet : sheets) {
			System.out.println(filePath + " ==> " + sheet);
		}
	}

	// 打印列标题
	private static void printHeader(String[] columns) {
		System.out.println();
		for (String column : columns) {
			System.out.print("\t\t" + column.toUpperCase());
		}
	}

	// 打印单元格数据
	private static void printBody(ArrayList<ArrayList<String>> dataList) {
		int index = 0;
		for (ArrayList<String> data : dataList) {
			index++;
			System.out.println();
			System.out.print(index);
			for (String v : data) {
				System.out.print("\t\t" + v);
			}
		}
	}

}
