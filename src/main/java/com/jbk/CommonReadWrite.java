package com.jbk;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class CommonReadWrite {

	@Test
	public void test01() throws Exception {
		
		FileInputStream fis= new FileInputStream("Test.xls");
		
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheetAt(0);
		
		Cell cell=sh.getRow(0).getCell(0);
		
		System.out.println(cell.toString());
		
		sh.createRow(5).createCell(0).setCellValue("writing in XLS file");
		
		FileOutputStream fos= new FileOutputStream("Test.xls");
		wb.write(fos);
		wb.close();
		
	}
	
	
	
}
