package com.java.Day18_12th_May_2024_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic3_Checked_vs_Unchecked_Exceptions {
	
	public static void main (String[] args) {
		anotherExampleOfRuntimeException();
	}

	// what are CompileTime(checked) Exceptions and what are RunTime(unchecked) Exceptions?
	
	// Exceptions always occur at RunTime. Exceptions never occur at CompileTime
	
	// CompileTime(Checked) - these are the exceptions which can be handled or warned by the compiler at compile time
	// RunTime(unchecked) - Exceptions which cannot be handled by the compiler at Compile time
	
	public static void filePresentOrNot() throws Exception {
		FileInputStream ip = new FileInputStream("");
		// What if the path you are specifying is not correct?
		// what is the file has been deleted while you are executing this code?
		// what if the name of the file has been changed while yolu are executing this code?
		
	}
	
	public static void classNotFoundExceptionExample() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();			// compile time exception
		}
	}
	
	public static void emapleOfRuntimeException() {
		System.out.println(1/0);			// logical mistake, the compiler will not be able to notice it
	}
	
	public static void anotherExampleOfRuntimeException() {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
	
}
