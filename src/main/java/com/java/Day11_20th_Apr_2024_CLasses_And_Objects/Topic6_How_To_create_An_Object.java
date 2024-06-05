package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class Topic6_How_To_create_An_Object {

	// there are 5 way to create an object in java
	// 1. 'new' keyword
	// 2. newInstance() method
	// 3. clone() method
	// 4. Deserialization
	// 5. factory methods
	
	String name;
	
	public static void main(String[] args) {

		Topic6_How_To_create_An_Object referenceVariable = new Topic6_How_To_create_An_Object();
		// new Topic6_How_To_create_An_Object() is the object
		// referenceVariable - this is just a reference variable which points to the object
		// Topic6_How_To_create_An_Object - name of the class
		referenceVariable.test();
		referenceVariable.name = "Hello";
		
		
	}
	
	public void test() {
		System.out.println("ciao");
	}
	
	

}
