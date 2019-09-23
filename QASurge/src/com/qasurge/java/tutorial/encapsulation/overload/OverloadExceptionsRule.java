package com.qasurge.java.tutorial.encapsulation.overload;

public class OverloadExceptionsRule {
	
	public void leaf() {
		System.out.println("No Exception");
	}
	
	public void leaf(String name) throws ClassCastException{
		System.out.println("New Exception");
	}
	
	public void leaf(String name1, String name2) throws Exception{
		System.out.println(name1+" "+name2);
	}
	
	public static void main(String[] args) throws Exception{
		OverloadExceptionsRule rule = new OverloadExceptionsRule();
		rule.leaf();
		rule.leaf("New Exception");
		rule.leaf("Broader", "Exception");
	}

}
