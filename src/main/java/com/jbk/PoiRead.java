package com.jbk;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiRead {

public static void main(String[] args)  throws Exception{
		
		FileInputStream fis = new FileInputStream("Test.xlsx");
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sh =wb.getSheet("Login");
		
		int row= sh.getPhysicalNumberOfRows();//2
						  //1
		int col= sh.getRow(row-1).getPhysicalNumberOfCells();//2
		
		System.out.println(row+"    "+col);
		
		for (int i = 0; i < row; i++) {// rows

			for (int j = 0; j < col; j++) {// cols

				Cell cell = sh.getRow(i).getCell(j);
				
				System.out.println(cell.getStringCellValue());
				
			/*	if(cell.getCellType()==cell.CELL_TYPE_STRING)
					System.out.print(cell.getStringCellValue()+"  ");
				
				if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
					System.out.print(cell.getNumericCellValue()+" ");*/
				
			}
			System.out.println();
		}
		wb.close();
	}
}
