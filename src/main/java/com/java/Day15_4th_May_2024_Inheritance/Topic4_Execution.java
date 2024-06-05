package com.java.Day15_4th_May_2024_Inheritance;

public class Topic4_Execution {

	public static void main(String[] args) {
		Topic2_Child1 child = new Topic2_Child1();
		child.superbike();
		child.sportscar();
		child.bungalow();
		child.farmHouse();
		
		Topic2_Parent parent = new Topic2_Parent();
		parent.bungalow();
		parent.shares();
		parent.farmHouse();
		parent.bank();
		parent.house();
	}
}
