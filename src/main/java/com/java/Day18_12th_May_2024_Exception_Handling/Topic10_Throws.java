package com.java.Day18_12th_May_2024_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic10_Throws {
	
	public static void main (String[] args) {
		try {
			filePresentOrNot();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("");
	}

}
