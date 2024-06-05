package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

//0% to 100% abstaction

// 1. it has to use the keyword abstract
// 2. the abstarct class can have both abstract(undefined/unimplented) methods and concrete/regular methods
// 3. a concrete (regular) class cam extend an abstract class but it has to implement all the unimplemented methods of the abstract class
// 4. cannot create the object of Abstract Class

// a normal class cannot have abstract methods

public abstract class Topic3_Student {

	String name;
	int age;
	
	public void studentLibrary() {
		System.out.println("this is a normal method");
	}
	
	public abstract void schoolCanteen();	// this is an abstract method or undefined/unimplemented method
	public abstract void schoolPlayground();
	public abstract void schoolBandPlay();	// we cannot make an abstract method static
	
	
}
