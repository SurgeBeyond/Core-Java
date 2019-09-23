package com.qasurge.java.tutorial.encapsulation.implementinginterface;

class A {
	public A methodA() {
		System.out.println("A");
		return new A();
	}
}

// Valid Covariant override return type
class B extends A {
	public B methodA() {
		System.out.println("B");
		return new B();
	}
}

public class OverrideCovariantReturnTypeExample {

	public static void main(String[] args) {
		B b = new B();
		b.methodA();
	}
}
