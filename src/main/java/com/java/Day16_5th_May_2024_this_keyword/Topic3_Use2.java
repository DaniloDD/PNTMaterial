package com.java.Day16_5th_May_2024_this_keyword;

public class Topic3_Use2 {
// can be used to invoke current class method(implicitly)
	
	public static void main(String[] args) {
		Topic3_Use2 use2 = new Topic3_Use2();
		use2.show();
	}
	
	void display() {
		System.out.println("hello world");
	}
	
	void show() {
		this.display();		// implicit call
	}

}
