package com.java.Day16_5th_May_2024_Date_Scanner_Wrapper;

public class Topic6_Parsing {

	// parsing - means converting a String representation of a value into its
	// corresponding data type

	public static void main(String[] args) {
		stringToBoolean();
	}

	public static void stringToDouble() {
		String price1 = "9.99";
		String price2 = "1.01";
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1 + p2);
		
	}

	public static void stringToInteger() {

		String price1 = "400";
		String price2 = "100";
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		System.out.println(p1 + p2);
	}

	public static void stringToBoolean() {

		String a = "true";
		String b = "false";
		
		System.out.println(a);
		
	}

}
