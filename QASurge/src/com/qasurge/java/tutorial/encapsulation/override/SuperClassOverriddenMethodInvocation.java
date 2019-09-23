package com.qasurge.java.tutorial.encapsulation.override;

// Invoking a Superclass Version of an Overridden Method

class Vehicle {
	public void testVehicle() {
		System.out.println("Vehicle");
	}
}

class Cycle extends Vehicle {
	public void testCycle() {
		System.out.println("Cycle");
	}

	public void testSuperClassMethod() {
		super.testVehicle();
	}

}

public class SuperClassOverriddenMethodInvocation {
	public static void main(String[] args) {
		Cycle cycle = new Cycle();
		cycle.testCycle();
		cycle.testSuperClassMethod();

	}

}
