package com.qasurge.java.tutorial.encapsulation.implementinginterface;

interface Fly {
	public void kite();
}

class Kite implements Fly {
	public void kite() {
		System.out.println("Kite");
	}
}

public class OverrideReturnRule7 {
	
	public Fly getObject() {
		return new Kite();
	}
	
	public static void main(String[] args) {
		OverrideReturnRule7 ob = new OverrideReturnRule7();
		Fly fly = ob.getObject();
		fly.kite();
	}

}
