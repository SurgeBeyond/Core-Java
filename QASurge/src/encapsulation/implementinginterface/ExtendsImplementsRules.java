package encapsulation.implementinginterface;

public class ExtendsImplementsRules {

	/**
	
	class Ball { }											 // Legal
	
	class Cricket implements Ball { } 						// Illegal! Can't implement a class
	
	interface InterFace1 { } 								// Legal
	
	interface InterFace2 { }								 // Legal
	
	interface InterFace3 implements InterFace1 { } 			// Illegal! Interface can't implement an interface
	
	interface InterFace4 implements Ball { } 				// Illegal! Interface can't implement a class
	
	interface InterFace5 extends Ball { } 					// Illegal! Interface can't extend a class
	
	interface InterFace6 extends InterFace2 { } 			// Legal. Interface can extend an interface
	
	class Games extends Ball, Button { } 					// Illegal! Class can't extend multiple classes
	
	class Planet implements InterFace2, InterFace3 { } 		// Legal. class can implement multiple interfaces
	
	interface Galaxy extends InterFace2, InterFace3 { } 	// Legal. interface can extend multiple interfaces
	
	class Country extends Ball implements InterFace2 { } 	// Legal. Class can do both (extends must be 1st)
	 
	  
	 */
	
}
