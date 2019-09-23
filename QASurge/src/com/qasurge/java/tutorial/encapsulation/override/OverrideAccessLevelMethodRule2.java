package com.qasurge.java.tutorial.encapsulation.override;

//A subclass within the same package as the instance's superclass can override
//any superclass method that is not marked private or final. 

class Planet {
	
	private void shape() {
		System.out.println("SuperClass Planet Shape");
	}
	
	final void rotate() {
		System.out.println("SuperClass Planet Rotate");
	}
}

class Earth extends Planet{
	
	void shape() {
		System.out.println("Sub Class Earth Shape");
	}
	
	/*void rotate() {
		System.out.println("Sub Class Earth");
	}*/
}

public class OverrideAccessLevelMethodRule2 {

}
