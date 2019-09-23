package com.qasurge.java.tutorial.encapsulation.implementinginterface;

interface Jump {
	public void methodJump();
}

interface Run {
	public void methodRun();
}

interface Eat {
	public void methodEat();
}

// Interface can extends one or more interface
interface Fish extends Eat{
	public void swim();
}

interface Animal extends Jump, Run, Eat {
	public void animal();
}

//Interface cannot implements interface
/*interface Animal2 implements Jump {
	public void animal();
}
*/
class Dog implements Animal {
	public void methodJump() {
		System.out.println("Jump");
	}

	public void methodRun() {
		System.out.println("Run");
	}

	public void methodEat() {
		System.out.println("Eat");
	}

	public void animal() {
		System.out.println("Animal");
	}
}

public class InterfaceExtendsInterfaceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.methodJump();
		dog.methodRun();
		dog.methodEat();
		dog.animal();
	}
}
