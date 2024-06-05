package com.java.Day11_20th_Apr_2024_CLasses_And_Objects;

public class Topic2_Conncetion_Between_Classes {

	public static void main(String[] args) {
		logic1.test1();
		logic1.test2();
	}

}


// adjacent class
class logic1 {		// default access modifier
	public static void test1() {
		System.out.println("This is an adjacent class");
	}
	
	public static void test2() {
		System.out.println("Hi");
	}
}