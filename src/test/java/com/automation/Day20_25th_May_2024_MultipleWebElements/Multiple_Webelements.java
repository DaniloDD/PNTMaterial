package com.automation.Day20_25th_May_2024_MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_Webelements {

	// total number of links in a website

	public WebDriver driver;

	@Test
	public void multipleElements() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");

		// total number of links at this instant?
		driver.findElements(By.tagName("a"));

		// each element is what? A WebElement. They are objects and they are stored in a
		// list

		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("total number of links is " + totallinks.size());

		// Find out the 101st link?
		// 101s link will be stored inside the 100th index position

		WebElement link101 = totallinks.get(100);
		System.out.println("the 101st link at this instand is : " + link101);
		System.out.println("its text is : " + link101.getText());

		// if i want to take the url of that link?
		System.out.println("the url is : " + link101.getAttribute("href"));

		// determine the x and y coordinates of that elements
		System.out.println(link101.getLocation().x + "-------" + link101.getLocation().y);

		// if you want to click on that link
		// link101.click()

		// total links are there. i want to print their respoective names and also check
		// if they are displayed or not

		for (int i = 0; i < totallinks.size(); i++) {
			System.out.println(totallinks.get(i).getText() + "----------" + totallinks.get(i).getAttribute("href")
					+ "---------" + totallinks.get(i).isDisplayed());
		}
	}
}
