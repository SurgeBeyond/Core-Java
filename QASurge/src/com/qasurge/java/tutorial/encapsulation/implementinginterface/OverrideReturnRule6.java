package com.qasurge.java.tutorial.encapsulation.implementinginterface;

// In a method with an object reference return type, you can return any
// object type that can be implicitly cast to the declared return type.

class Employee {
	Employee getEmployee() {
		return new Employee();
	}
}

class Company extends Employee {
	Employee getEmployee() {
		return new Company();
	}
}

public class OverrideReturnRule6 {

	public static void main(String[] args) {

	}

}
