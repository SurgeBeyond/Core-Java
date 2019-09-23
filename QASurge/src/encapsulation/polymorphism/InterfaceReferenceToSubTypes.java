package encapsulation.polymorphism;

interface Waterable {
	public void water();
}

class River implements Waterable {	
	public void water() {
		System.out.println("Water");
	}		
	public void river() {
		System.out.println("River");
	}	
}

class Ocean extends River {
	public void Ocean() {
		System.out.println("Ocean");
	}
}

//A reference variable can be declared as an interface type.
public class InterfaceReferenceToSubTypes {

	public static void main(String[] args) {
		Waterable water1 = new River();
		Waterable water2 = new Ocean();
		
		water1.water();
		water2.water();
	}

}
