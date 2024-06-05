package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class Topic7_Calling_Static_and_NonStatic_Entities {

	static int age;
	String name = "Tom";
	double height = 4.5;
	String section = "A";
	
	// static entities can call themselves directly or with the help of classname
	// static can call static
	// static cannot call non-static without creating the object
	// non-static can call non-static
	// non-static can call static
	
	public static void main(String[] args) {

		int age = 30;
		System.out.println(age);
		logic1();
		logic2(200, 300);
		
		Topic7_Calling_Static_and_NonStatic_Entities ref = new Topic7_Calling_Static_and_NonStatic_Entities();
		ref.name = "Tom";
		ref.height = 4.5;
		ref.section = "A";
		ref.test1();
		ref.test2("ABC", "XYZ");
		
		
	}

	public static void logic1() {
		System.out.println("This is a static mehtod");
	}
	
	public static void logic2(int a, int b) {
		System.out.println("The sum is : " + (a+b));
	}
	
	public void test1() {
		test2("Ci", "ao");
		logic1();
		System.out.println("This is a non static method");
	}
	
	public String test2(String s1, String s2) {
		String s3 = s1 + s2;
		return s3;
	}
}
