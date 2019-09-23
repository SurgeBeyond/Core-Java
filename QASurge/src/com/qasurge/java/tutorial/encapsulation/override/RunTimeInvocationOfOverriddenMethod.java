package com.qasurge.java.tutorial.encapsulation.override;

class Plant {

	public void height() {
		System.out.println("upto five ft.");
	}
}

class Tree extends Plant{
	public void height() {
		System.out.println("Upto twenty ft.");
	}
}

public class RunTimeInvocationOfOverriddenMethod{
	public static void main(String[] args) {
		Plant plant = new Tree();
		// Compiler allows the invocation of Reference methods.
		// JVM at run time calls overrideen methods.
		plant.height();
	}
}
