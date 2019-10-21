package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static String[][] getData(String filename, String sheetname)
	{
		File f = null;
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		
		try
		{
			 f= new File(filename);
			 fin = new FileInputStream(f);
			 wb = new XSSFWorkbook(fin);
			 sh = wb.getSheet(sheetname);
			 
			 int rows = sh.getLastRowNum()+1;
			 int cells = sh.getRow(0).getLastCellNum();
			 
			 String[][] data = new String[rows][cells];
			 for(int i = 0; i<rows; i++)
			 {
				 Row r = sh.getRow(i);
				 for(int j = 0; j<cells; j++)
				 {
					 Cell c = r.getCell(j);
					 String cellValue =new  DataFormatter().formatCellValue(c);
					 data[i][j] =  cellValue;
				 }
			 }
			return data;
		}
		catch(Exception e)
		{
			return null;
		}
		
		finally
		{
			try
			{
				wb.close();
				wb = null;
				sh=null;
				fin.close();
				fin = null;
				f = null;
			}
			catch(Exception e)
			{
				
			}
			
			
		}
	}

}
