package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class Topic3_What_Is_Static {

	static int age;		// static variable
	String name;		// non-static variable
	
	// static is mostly used for something that is not supposed to change
	// static is closely related to Class
	
	public static void main(String[] args) {
		test1(200, 300);
		Topic3_What_Is_Static.test1(300, 223);
		age = 60;
		System.out.println(age);
		Topic3_What_Is_Static.age = 300;
		System.out.println(age);

	}
	
	// when a method is static we can directly call it 
	public static void test1(int a, int b) {
		System.out.println("The sum fo two numbers : " + (a+b));
	}

}
