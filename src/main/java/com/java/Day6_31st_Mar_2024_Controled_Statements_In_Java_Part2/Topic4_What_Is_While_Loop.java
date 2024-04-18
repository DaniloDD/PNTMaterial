package com.java.Day6_31st_Mar_2024_Controled_Statements_In_Java_Part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic4_What_Is_While_Loop {

	public static void whatIsWhileLoop() {
		// it is used when the end point is not clear
		// when something tends to infinity we use while loop

		// for example let go to cnn.com or bbc.com

		// SYNTAX
		int i = 1; // declaration for the condition
		while (i < 6) {
			System.out.println("Keep printing the value of i");
			i = i++;
		}

	}

	public static void printNumbersFrom1to10() {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void printFirst50WholeNumbers() {
		int i = 1;
		while (i <= 50) {
			System.out.print(i + ", ");
			i++;
		}
	}
	
	public static void print100NumbersInAReverseMannerStartingFrom100() {
		int i = 100;
		while (i>0) {
			System.out.print(i + ", ");
			i--;
		}
	}
	
	public static void print20Multiplesof5() {
		// 5, 10, 15, 20,...
		int i = 0;
		int j = 5;
		while (i < 20) {
			System.out.println(j);
			i++;
			j = j+5;
		}
	}
	
	public static void print1083Multipleof97() {
		int i = 1;
		while (i<1083) {
			System.out.println(i*97);
			i++;
		}
		
	}
	
	public static void print20MultiplesOf5AndCalcuateTheSumOfTheMuiltples() {
		// 5,10, 15, ...100
		// 5 + 10 + 15 + ...+ 100
		int i = 1;
		int sum = 0;
		while (i<=20) {
			System.out.println(i*5);
			sum = sum + (i*5); // sum = 0 + 5 = 5
			i++; 			// 2
			System.out.println("The step of each addition is : " + sum);
		}
		System.out.println("The sum is : " + sum);
		
	}

	
	// more advance that we will see better in the future
	public static void cnnDotComTotalLinksToday() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("total number of links present today is :" + totalLinks.size());
	}

	public static void main(String[] args) {
		print1083Multipleof97();

	}

}
