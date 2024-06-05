package com.java.Day16_5th_May_2024_this_keyword;

// 4. can be used to pass an argument in a method call

public class Topic5_Use4 {

	public static void main(String[] args) {
		Topic5_Use4 use4 = new Topic5_Use4();
		use4.method2();
	}
	
	public void methodToBeUsed(Topic5_Use4 useme) {
		System.out.println("i am inside the method to be used for use number 4");
	}
	
	public void method2() {
		methodToBeUsed(this);
	}

}
