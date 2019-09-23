package encapsulation.implementinginterface;

interface Waterable{
	public void flow();
	public void direction();
}

abstract class Rain implements Waterable{  //  Abstract Implementation of interface birds
	public void methodRain() {}
}

class Monsoon extends Rain{
	public void flow() {
		System.out.println("Flow");
	}
	public void direction() {
		System.out.println("Direction");
	}
	public void methodRain(){
		System.out.println("Rain");
	}
}

public class AbstractInterfaceImplemenationExample {

	public static void  main(String[] args) {
		//Rain rain = new Rain(); // Compiler Error
		
		Monsoon july = new Monsoon();
		july.flow();
		july.direction();
		july.methodRain();
		
	}
}
