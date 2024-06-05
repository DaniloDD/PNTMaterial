package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class Topic8_ClassAssignment {

	// create a class
	// make sure it has the main method
	// create 2 static variables and 2 non static variable of this class
	// create 2 static methods
	// create 2 non static methods
	// create 3 objects of this class
	// call all the static entities directly inside the main method
	// call all the non static entitites using the object references
	// call static entities within each other
	// call non static entities within each other
	// call static entities within non static entities
	// use the object references to call static entities and not down the warning
	// create an Adjacent class and try to create an object of that class and try calling it
	
	String firstName;
	int age;
	static String mainSubject;
	static float height;
	
	public static void main(String[] args) {
		mainSubject = "Mathematics";
		double height =5.11;
		System.out.println(height);
		
		
		Topic8_ClassAssignment ref1 = new Topic8_ClassAssignment();
		Topic8_ClassAssignment ref2 = new Topic8_ClassAssignment();
		Topic8_ClassAssignment ref3 = new Topic8_ClassAssignment();
		
	}
	
	public static void logic1() {
		System.out.println("This is logic1");
	}
	
	public static void logic2() {
		System.out.println("This is logic2");
	}
	
	public void test1() {
		System.out.println("This is test1");
	}
	
	public void test2() {
		System.out.println("This is test2");
	}

}
