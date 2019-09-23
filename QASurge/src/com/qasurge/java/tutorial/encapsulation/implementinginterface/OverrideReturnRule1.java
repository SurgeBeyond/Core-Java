package com.qasurge.java.tutorial.encapsulation.implementinginterface;

// NULL can be returned
class Sea{
	public Sea depth() {
		return null;
	}
}
public class OverrideReturnRule1 {

	public static void main(String[] args) {
		Sea sea = new Sea();
		System.out.println(sea.depth());
	}
}
