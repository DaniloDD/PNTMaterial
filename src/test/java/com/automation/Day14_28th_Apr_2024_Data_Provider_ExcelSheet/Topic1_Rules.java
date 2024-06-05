package com.automation.Day14_28th_Apr_2024_Data_Provider_ExcelSheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Topic1_Rules {

	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellType cellType;
	/*
	 * Rule1 - Add Apache poi dependencies in pom.xml file 
	 * Rule2 - Create an .xlsx file and have the data 
	 * Rule3 - close the Excel sheet if you have opened in your laptop 
	 * Rule4 - Copy that Excel sheet and put it inside the package in which you are writing your code 
	 * Rule5 - Create the Object of FileInputStream class and pass the path of the Excel sheet in the constructor 
	 * Rule6 - Create the Object of XSSFWorkbook
	 * Rule7 - use the workbook reference to address individual sheet
	 * Rule8 - we have to identify no of rows and no of cols
	 * Rule9 - create a 2-D Object Array and then return the Object Array
	 */

	public static Object[][] readFromExcelSheetTNLogin(String sheetName) throws Exception {
		// Rule 5
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "/src/test/java/com/automation/Day14_28th_Apr_2024_Data_Provider_ExcelSheet/Automation.xlsx");

		// Rule 6
		workbook = new XSSFWorkbook(ip);

		// Rule 7
		sheet = workbook.getSheet(sheetName); // identify the particular sheet from which we need the data

		// Rule 8 - identify no of rows and cols
		int rows = sheet.getLastRowNum(); // total n of rows
		int cols = sheet.getRow(0).getLastCellNum(); // total n of cols

		// Rule 9
		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {
			row = sheet.getRow(i + 1); // cause first line is only the title, so we want the values from the next
			for (int j = 0; j < cols; j++) {
				cell = row.getCell(j);
				cellType = cell.getCellType();

				switch (cellType) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;

				case NUMERIC:
					data[i][j] = Integer.toString((int) cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}
			}

		}
		return data;
	}

}
