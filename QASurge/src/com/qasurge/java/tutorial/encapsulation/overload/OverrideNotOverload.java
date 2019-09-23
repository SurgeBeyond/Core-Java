package com.qasurge.java.tutorial.encapsulation.overload;

class Room {
	public void ceil() {
		System.out.println("CEIL");
	}
}

class House extends Room {
	public void ceil() {
		System.out.println("This is an Overridden not Overloaded method");
	}
}

public class OverrideNotOverload {

	public static void main(String[] args) {
		Room room = new House();
		room.ceil();
	}

}
