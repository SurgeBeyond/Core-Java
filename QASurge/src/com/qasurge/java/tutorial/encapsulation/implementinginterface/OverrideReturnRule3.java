package com.qasurge.java.tutorial.encapsulation.implementinginterface;

// In a method with a primitive return type, you can return any value or
// variable that can be implicitly converted to the declared return type.
class Orange{
	
	public int getOranges() {
		char no = 'a';
		return (int) no;
	}
}

public class OverrideReturnRule3 {
	
	public static void main(String[] args) {
		System.out.println((new Orange()).getOranges());
	}

}
