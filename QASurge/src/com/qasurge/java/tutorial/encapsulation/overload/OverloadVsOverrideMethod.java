package com.qasurge.java.tutorial.encapsulation.overload;

public class OverloadVsOverrideMethod {

	/**
	  				Overloaded Method								Overridden Method
	 
	 Argument(s) 	Must change. 									Must not change.
	 
	Return type 	Can change. 									Can’t change except for covariant returns.
	
	Exceptions 		Can change. 									Can reduce or eliminate.
 					 					 							Must not throw new or broader checked exceptions.
 					 					 							
	Access 			Can change. 									Must not make more restrictive (can be less restrictive).
	
	Invocation 		Reference type determines which 				Object type (in other words, the type of the
					overloaded version (based on 					actual instance on the heap) determines which
					declared argument types) is selected. 			method is selected. Happens at runtime.
					Happens at compile time. The actual 
					method that’s invoked is still a 
					virtual method invocation that 
					happens at runtime, but the 
					compiler will already know the  
					signature of the method to be invoked. 
					So at runtime, the argument match 
					will already have been nailed down, 
					just not the class in which the method 
					lives.
	
	 */
}
