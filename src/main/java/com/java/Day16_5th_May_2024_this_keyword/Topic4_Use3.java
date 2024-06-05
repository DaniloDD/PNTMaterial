package com.java.Day16_5th_May_2024_this_keyword;

public class Topic4_Use3 {

//this() can be used to invoke current Class constructor

	public static void main(String[] args) {
		Topic4_Use3 use3 = new Topic4_Use3();
	}

	public Topic4_Use3() {	// this is also a current class constructor

	}

	public Topic4_Use3(int i) {

		this();	// this is pointing towards the constructor at row number 11
		System.out.println("This is overloaded constructor");
	}

}
