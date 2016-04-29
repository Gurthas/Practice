package com.learnPoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel { 
		 public static void main(String[] args) throws IOException {
		  File file = new File("test1.xls");
		  if(!file.exists()){
		   file.createNewFile();
		  }
		  List<Computer> computers = new ArrayList<Computer>();
		  computers.add(new Computer(1,"宏碁","笔记本电脑",3333,9.0));
		  computers.add(new Computer(2,"苹果","笔记本电脑，一体机",8888,9.6));
		  computers.add(new Computer(3,"联想","笔记本电脑，台式机",4444,9.3));
		  computers.add(new Computer(4, "华硕", "笔记本电脑,平板电脑",3555,8.6));
		  computers.add(new Computer(5, "注解", "以上价格均为捏造，如有雷同，纯属巧合", 1.0, 9.9));
		  write2excel(computers, file);
		 }
		 
		 public static void write2excel(List<Computer> computers,File file) {
		  HSSFWorkbook excel = new HSSFWorkbook();
		  HSSFSheet sheet = excel.createSheet("computer");
		  HSSFRow firstRow = sheet.createRow(0);
		  HSSFCell cells[] = new HSSFCell[5];
		  String[] titles = new String[] { "id", "name", "description", "price",
		    "credit" };
		  for (int i = 0; i < 5; i++) {
		   cells[0] = firstRow.createCell(i);
		   cells[0].setCellValue(titles[i]);
		  }
		  for (int i = 0; i < computers.size(); i++) {
		   HSSFRow row = sheet.createRow(i + 1);
		   Computer computer = computers.get(i);
		   HSSFCell cell = row.createCell(0);
		   cell.setCellValue(computer.getId());
		   cell = row.createCell(1);
		   cell.setCellValue(computer.getName());
		   cell = row.createCell(2);
		   cell.setCellValue(computer.getDescription());
		   cell = row.createCell(3);
		   cell.setCellValue(computer.getPrice());
		   cell = row.createCell(4);
		   cell.setCellValue(computer.getCredit());
		  }
		        OutputStream out = null;
		        try {
		            out = new FileOutputStream(file);
		            excel.write(out);
		            out.close();
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 }
		}

