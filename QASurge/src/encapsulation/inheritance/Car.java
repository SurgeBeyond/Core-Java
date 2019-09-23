package encapsulation.inheritance;

// Code Reuse
public class Car {

	public void noOfWheels() {
		System.out.println("Car has 4 Wheels");
	}
}

class Maruti extends Car {

	public void model() {
		System.out.println("Maruti Suzuki Dzire");
	}
}

class Example {
	public static void main(String[] args) {
		Maruti maruti = new Maruti();
		maruti.noOfWheels();
		maruti.model();
	}
}