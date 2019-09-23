package encapsulation.polymorphism;

interface Gearable {
	void noOfGears();
}

class Tyre {
	public void tyre() {
		System.out.println("Tyre");
	}
}

class Car extends Tyre implements Gearable {

	public void noOfGears() {
		System.out.println("Five Gears");
	}

	public void vehicleType() {
		System.out.println("Car");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		// Legal Declarations
		Object object =  new Car();
		Tyre tyre =  new Car();
		Gearable gearable =  new Car();
		Car car = new Car();
	}

}
