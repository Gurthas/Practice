package com.mia.Excle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiExcleWrite {

	// Excle写入指定位置
	/*
	 * path 文件名 sheet sheet页ID默认0开始 rows 行数默认0开始 cols 列数默认0开始 auth
	 * 插入位置使用新建方式create，get方式对未插入数据的坐标无效
	 */

	public void excleWrite(String Path, int sheetindex, int rows, int cols, String response) {

		try {
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(Path));

			XSSFDataFormat format = workbook.createDataFormat();
			XSSFCellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setDataFormat(format.getFormat("@"));
			XSSFSheet sheet = workbook.getSheetAt(sheetindex);
			XSSFRow row = sheet.getRow((short) rows);
			XSSFCell cell = row.createCell(cols);
			cell.setCellValue(response);
			cell.setCellStyle(cellStyle);
			cell.setCellType(XSSFCell.CELL_TYPE_STRING);
			FileOutputStream out = null;
			try {
				out = new FileOutputStream(Path);
				workbook.write(out);

			} catch (IOException e) {

				e.printStackTrace();

			} finally {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PoiExcleWrite ex = new PoiExcleWrite();
		String filePath = "c:/测试数据.xlsx";
		// ex.excleWrite("c:/测试数据.xlsx", 1, 4,6, "text");
		ex.excleWrite(filePath, 2, 5, 1, "12-21");
		ex.excleWrite(filePath, 2, 5, 2, "12-22");
		ex.excleWrite(filePath, 2, 5, 3, "12-23");
		ex.excleWrite(filePath, 2, 5, 4, "12-24");
		ex.excleWrite(filePath, 2, 5, 5, "12-25");
	}
}
