package com.java.Day10_14th_Apr_2024_Strings;

public class Topic2_Memory_Location_In_Java {
	
	/*
	 There are 5 memory locations in Java:
	 1) Heap Memory			(currently String are stored here and everything else as well)
	 2) Stack Memory
	 3) PC Register
	 4) Method Area
	 5) Native Method Area
	 
	 N.B. if the string is created directly as a literal value like String S1 = "Java", this value will be stored in the SCP/SLP memory
	 
	 */
	
	// Strings have been given a special place in the Heap Memory known as SCP/SLP (String Literal Pool/ String Constant Pool)
	
	// Java is an Object Oriented Programming Language
	// Objects are very important
	// Classes create objects
	// you can create a new object with the help of keywords
	
	
	public static void main(String[] args) {
		
		String S3 = new String();		//String is a pre-defined class
		
		String S4 = "Java";				//This is also a String object
		
		String S5 = new String("Python");	// 2 objects will be created. 1 in the heap memeory and 1 in the scp memeory
	}
	
	
	public static void understandingStringsBetter() {
		String S1 = new String();				// 1 object will be created in Heap Memory which will be referred by S1
		String S2 = new String("Java");			// 2 objects will be created , one in Heap and one in SLP (internal jvm reference, the literal object "Java")
		String S3 = new String ("Java");		// 1 object will be created in the heap memory, the second in the SLP will not be created because it is already present
		String S4 = "Java";						// this will point directly to the SLP object that was created already, so the internal JVM reference will be overwritten by the literal value.
		String S5 = "Java"; 					// this will point to the SLP object, overwriting the S4 reference
		String S6 = "Python";					// a different object will be created in the SLP with the value "Python"
		
	}

}
