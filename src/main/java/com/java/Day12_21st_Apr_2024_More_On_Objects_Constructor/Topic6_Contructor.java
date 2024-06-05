package com.java.Day12_21st_Apr_2024_More_On_Objects_Constructor;

public class Topic6_Contructor {

	// Constructors initializes an object
	// Constructors never create an object
	// They are used to initialize an object and help in optimizing the code

	// Constructors are create are invoked by default when an object is created

	// Constructors do not have a return type, not even void
	// Constructor is a block rather calling it a special type of method
	// constructor is a block rather than calling it a special method

	
	String firstName;
	String lastName;
	int age;
	int grade;
	String mainSubject;
	boolean graduated;
	
	public static void main(String[] args) {

		Topic6_Contructor student1 = new Topic6_Contructor("Tom", "Holland", 19, 4, "IT", false);
		System.out.println(student1.firstName + student1.lastName);
		
	}

	// syntax of a constructor - it will always have the name of the class
	// it is a block of code used to initialize the object
	// it cannot be static
	
	public Topic6_Contructor(String firstName, String lastName, int age, int grade, String mainSubject, boolean graduated) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		this.mainSubject = mainSubject;
		this.graduated = graduated;
	}

}
