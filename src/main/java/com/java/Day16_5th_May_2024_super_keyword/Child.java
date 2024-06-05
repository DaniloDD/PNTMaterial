package com.java.Day16_5th_May_2024_super_keyword;

// super is used to invoke to refer to immediate parent class instance variable
// it can be used to invoke the parent class method
// super() can be used to invoke parent class constructor


public class Child extends Parent{

	int i = 20;
	
	public static void main(String[] args) {
		Child child = new Child();		// this is the first logical statement which is creating the object of child class. where the constrcutor is automatically called
		child.show(100);
	}
	
	void show (int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.a);
		super.take();
	}
	
	public Child() {
		super();		// this will be called first
	}
}
