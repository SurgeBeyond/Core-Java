package com.qasurge.java.tutorial.encapsulation.overload;

// Overloaded methods CAN change the return type.
public class OverloadReturnTypeRule {

	public int tutorials(int number) {
		return number;
	}

	public String tutorials(String name) {
		return name;
	}

	public String tutorials(String name, int number) {
		return name+number;
	}

	// Invocation of Overload methods
	public static void main(String[] args) {
		OverloadReturnTypeRule rule = new OverloadReturnTypeRule();
		
		int number = rule.tutorials(3);
		System.out.println(number);
		
		String name = rule.tutorials("QASurge");
		System.out.println(name);
		
		String name2 = rule.tutorials("QASurge"+ 100);
		System.out.println(name2);
	}

}
