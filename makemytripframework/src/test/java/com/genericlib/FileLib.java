package com.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class FileLib {

	/**
	 * Method to retrieve value associated with key  
	 * @param path
	 * @param key
	 * @return
	 */
	
	
	public String retreiveValue(String path, String key)
	{
		FileInputStream ip=null;
		Properties prop=null;
		
		try {
			ip = new FileInputStream(path);
			prop = new Properties();
			prop.load(ip);
		} 
		catch (Throwable e) {
						e.printStackTrace();
		}
		
		
		return prop.getProperty(key);
	}
	
	
	/**
	 * Generic method to retrieve data from Excel
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	
	@DataProvider(name = "fromExcel")
	public String retrieveExcelData(String path, String sheetName, int rowNum, int cellNum)
	{
		FileInputStream ip = null;
		Workbook wb = null;
		
		try {
			ip = new FileInputStream(path);
			wb = WorkbookFactory.create(ip);
		} 
		
		catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		
	}
	
}
