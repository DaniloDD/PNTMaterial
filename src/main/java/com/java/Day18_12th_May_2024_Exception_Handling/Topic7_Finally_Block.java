package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic7_Finally_Block {
	
	/*
	Rule 1: finally block will execute no matter Exception occurs or not
	Rule 2: You can execute finally block with only try block.
	Rule 3: you can execute finally block with only try block. You can choose not to use catch block but in case there is an exception it will not be handled
	
	Note. try block     - has the risky code
		  catch block	- has the handling code
		  finally block - is the imposing code
	
	 */
	
	public static void main(String[] args) {
		
	}
	
	public static void example1() {
		try {
			int a = 10;
			int b =0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("I am still gonna print sum of two numbers + " + (1+2));
		}
	}

}
