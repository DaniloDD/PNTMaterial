package com.automation.Day14_28th_Apr_2024_Data_Provider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic1_Rules_Of_DataProvider {

	// provides data to Test Cases
	
	/*
	Rules of @DataProvider:
	1) dataprovider will return a 2-D Object Array
	2) Pass the data in rows and cols format in that 2-D array
	3) Conncet the @Test case with @DataProvider in 2 simple ways
		i. by providing a TestNG annotation known as dataProvider = nameOfTheMethod inside the @DataProvider
		ii. by passing a TestNG annotation known as name = nameOfTheMethod inside the @DataProvider
	4) Need to parameterize the method in @Test with all the cols declared in the 2-D Array	
	 */
	
	@Test (dataProvider = "getData")
	public void checking(String username, String password, String browser, int rollnumber) {
		// we have to connect it with the data provider
		System.out.println(username + "--------"+ password + "--------" + browser + "--------"+ rollnumber);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = "chrome";
		data[0][3] = 123;
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = "chrome";
		data[1][3] = 124;
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = "chrome";
		data[2][3] = 125;
		
		return data;
	}
	
}
