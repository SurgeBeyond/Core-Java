package com.qasurge.java.tutorial.encapsulation.override;

// Final and Static methods cannot be overriden
public class OverrideStaticAndFinalRules {
	
	final void testA() {}
	static void testB() {}
}

class TestA extends OverrideStaticAndFinalRules{
	
	//final void testA() {}
	//static void testB() {}
}
