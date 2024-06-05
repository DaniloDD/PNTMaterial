package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic4_How_To_Handle_exceptions {
	
	public static void main (String[] args) {
		runtimeExceptionExample();
	}

	
	public static void runtimeExceptionExample() {
		int a = 10;
		int b =0;
		int c= a/b;
		System.out.println(c);
	}
	
	// this method will create an object:
	// the object will contain:
	// 1. name of the exception
	// 2. description of the exception
	// 3. stacktrace --> trace where the exception occured
	// but this method does not have a way to handle the exception so it will pass this object to the jvm
	// if the jvm also is not able to handle that exception it will be passed to the entity known as: Default Exception Handler
	
	
	
	public static void explanation() {
		/*
		
		Step 1: the programmer will create a logical mistake inside the method
		Step 2: the compiler is not able to interfere, so it is not a compile time exception
		Step 3: this method that holds the logical mistake will create an Object known as 
		Step 4: it will contain the 3 things mentioned before
		Step 5: the Object cannot handle the exception
		Step 6: It will pass the Object to the JVM
		Step 7: if the JVM cannot handle the exception it will pass it to the Default Exception Handler
		Step 8: But before handling this object to DEH, jvm will abruptly terminate the program
		Step 9: DEH will print the exception details in the output console
		 */
	}
	
	public static void howToHandleExceptionManually() {
		// java gives you 5 different key words to handle this manually
		// 1. try
		// 2. catch
		// 3. finally
		// 4. throw
		// 5. throws
	}
	
	
}
