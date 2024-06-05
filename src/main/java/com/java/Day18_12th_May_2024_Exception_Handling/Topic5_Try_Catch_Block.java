package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic5_Try_Catch_Block {

	public static void main (String[] args) {
		example3_use_TryCatchCode_Without_A_Risky_Code();
		
		// you can do also multiple try catch block - Homework
	}
	
	public static void example1() {
		try {
			int a = 10;
			int b =0;
			int c= a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void example2() {
		System.out.println(1);
		System.out.println(1);
		System.out.println(5/0);		
		System.out.println(1);
		System.out.println(1);
	}
	
	public static void example3_use_TryCatchCode_Without_A_Risky_Code() {
		try {
			int a = 10;
			int b =2;
			int c= a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void multipleTryCatchBlocks() {
		try {
			int a = 10;
			int b =0;
			int c= a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				int a = 10;
				int b =0;
				int c= a/b;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
