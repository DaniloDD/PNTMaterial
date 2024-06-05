package com.automation.Day20_25th_May_2024_MultipleWebElements;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ResponseCode {

	// collect all the footer links in a list

		// click on each link in the footerlink and get their respective title or
		// currenturl

		public WebDriver driver;

		@Test
		public void fliplart() throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");

			List<WebElement> footer = driver.findElements(By.xpath("/html/body/div[7]"));
			
			System.out.println("Total links are : " + footer.size());
			
			for (int i=0; i< footer.size(); i++) {
				System.out.println(footer.get(i).getText() + "-------" + footer.get(i).getAttribute("href"));
				
				// if the url is returning response code == 200 then only allow click operation
				boolean result = validateResponseCode("");
				
				
				
				// investors - click on this footerlink and get me the title of this page
				footer.get(i).click();
				System.out.println("The title of investors is : " + driver.getTitle());
				
				driver.navigate().back();
				Thread.sleep(2000);
				// StaleElementException
				footer = driver.findElements(By.xpath("/html/body/div[7]"));
				Thread.sleep(2000);
			}

		}
		
		public boolean validateResponseCode(String url) throws IOException, Exception {
			// check in wikipedia the list of HTTP status codes
			// 200 is the response code which is OK status
			
			int response_code = 0;
			response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			if (response_code == 200) {
				return  true;
			}
			else {
				return false;
			}
			
		}
}
