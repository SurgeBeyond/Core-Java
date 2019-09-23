package com.qasurge.java.tutorial.encapsulation.overload;

// Overloaded methods MUST change the argument list.
public class OverloadArgumentListRule {

	public void tutorials() {
		System.out.println("No arguments");
	}

	public void tutorials(String name) {
		System.out.println(name);
	}

	public void tutorials(String name, int number) {
		System.out.println(name + " " + number);
	}

	public void tutorials(int number, String name) {
		System.out.println(number + " " + name);
	}

	// Invocation of Overload methods, depends on the arguments
	public static void main(String[] args) {
		new OverloadArgumentListRule().tutorials();
		new OverloadArgumentListRule().tutorials("QASurge");
		new OverloadArgumentListRule().tutorials("QASurge", 3);
		new OverloadArgumentListRule().tutorials(3, "QASurge");
		
	}

}
