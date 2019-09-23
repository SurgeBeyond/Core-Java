package encapsulation.implementinginterface;

class Car{
	public void color() {
		System.out.println("Color");
	}
}

class Maruti extends Car{
	public String color(int x) {
		System.out.println("White");
		return "White";
	}
}

public class OverloadeReturnTypeExample1 {
	
	public static void main(String[] args) {
		Maruti maruti = new Maruti();
		maruti.color();
		maruti.color(1);
	}

}
