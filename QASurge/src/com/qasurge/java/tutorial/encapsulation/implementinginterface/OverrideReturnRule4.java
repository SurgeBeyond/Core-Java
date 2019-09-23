package com.qasurge.java.tutorial.encapsulation.implementinginterface;

// In a method with a primitive return type, you can return any value or
// variable that can be explicitly cast to the declared return type.

public class OverrideReturnRule4 {

	public int getValue() {		
		float value = 10.10f;
		return (int) value;
	}
	
	public static void main(String[] args) {
		OverrideReturnRule4 ob = new OverrideReturnRule4();
		System.out.println(ob.getValue());
	}
	
}
