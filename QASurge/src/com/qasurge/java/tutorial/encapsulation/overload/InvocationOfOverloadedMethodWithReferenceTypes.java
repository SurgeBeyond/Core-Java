package com.qasurge.java.tutorial.encapsulation.overload;

// Invocation of overloaded method with non primitive data types or reference types

class Language {
}

class Java extends Language {
}

public class InvocationOfOverloadedMethodWithReferenceTypes {

	void method1(Language language) {
		System.out.println("Language");
	}

	// Overloaded method
	void method1(Java java) {
		System.out.println("Java");
	}

	public static void main(String[] args) {
		Language language = new Language();
		Java java = new Java();

		InvocationOfOverloadedMethodWithReferenceTypes example = new InvocationOfOverloadedMethodWithReferenceTypes();
		example.method1(language);
		example.method1(java);

		// Reference Type // Actual Object
		Language language2 = new Java();

		// Linking happens at compile time for overloaded methods
		// Method is called on the basis of Reference type and not actual object passed.
		// Overload methods are not an example of Polymorphism
		example.method1(language2);
	}
}
