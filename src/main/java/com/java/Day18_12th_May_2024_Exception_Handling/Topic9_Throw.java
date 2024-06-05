package com.java.Day18_12th_May_2024_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic9_Throw {

	public static void main(String[] args) {

	}

	public static void divedByZero() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
		throw new ArithmeticException();
	}

	/*
	public static void filePresentOrNot() throw FileNotFoundException {    --> throw keyword will not be able to handle it
		FileInputStream ip = new FileInputStream("");
	}
	*/
}
