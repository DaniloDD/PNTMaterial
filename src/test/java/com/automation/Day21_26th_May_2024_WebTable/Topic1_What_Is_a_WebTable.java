package com.automation.Day21_26th_May_2024_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_What_Is_a_WebTable {

	// it is a dynamic table which represents data in the form of rows and cols
	// criteria to work with WebTables - very 
	
	// url - https://money.rediff.com/gainers/bse/daily/groupall
	// html - table
	// class - dataTable
	
	// table - parent
	// 	thead - represents the top row
	//	  tr - this represents the row of the head
	//		th - represents the 5 colums present in the row. So here tr acts as the parent of all these th
	
	// 	tbody - represents the full body
	//	  tr - this represents the row present in the body
	//		td - this represents each col present in the row. So tr acts as a parent to all these td
	
	// table[@class = 'dataTable'] - this represents the whole of WebTable which also includes the top header row as well as the body
	// table[@class = 'dataTable']/thead - this represents the whole header row and it excludes the body
	// table[@class = 'dataTable']/tbody - this represents the whole body and it excludes the header row
	
	
	public WebDriver driver;
	
	@Test
	public void understandingWebTables() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		List<WebElement> namesOfColsOfHeaderRow = driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th"));
		
		for (int i =0; i < namesOfColsOfHeaderRow.size(); i++) {
			System.out.println(namesOfColsOfHeaderRow.get(i).getText());
		}
	}
	
	@Test
	public void printAnIndividualColInHeaderRow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		// print a simple way
		WebElement specificColName = driver.findElement(By.xpath("//table[@class = 'dataTable']/thead/tr/th[4]"));
		System.out.println(specificColName.getText());
		
		System.out.println("****************");
		
		// you can use this way also
		List<WebElement> namesOfColsOfHeaderRow = driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th[4]"));
		for (int i =0; i < namesOfColsOfHeaderRow.size(); i++) {
			System.out.println(namesOfColsOfHeaderRow.get(i).getText());
		}
	}
	
	@Test
	public void printAllTheBodiesOfTheRow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
	
		
		// you canuse this way also
		List<WebElement> namesOfColsOfHeaderRow = driver.findElements(By.xpath("//table[@class = 'dataTable']/thead/tr/th"));
		for (int i =0; i < namesOfColsOfHeaderRow.size(); i++) {
			System.out.println(namesOfColsOfHeaderRow.get(i).getText());
		}
	}
	
	
	
	
}
