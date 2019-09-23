package com.qasurge.java.tutorial.encapsulation.overload;

// A method can be overloaded in a subclass
class A {
	void methodA(int number) {
		System.out.println(number);
	}
}

class B extends A {
	void methodA(String name) {
		System.out.println(name);
	}
}

public class OverloadSubClassMethodRule {

	public static void main(String[] args) {
		B b = new B();
		b.methodA(5);
		b.methodA("QASurge");
	}

}
