package encapsulation.referencevariablecasting;

interface Edible {
	public void eat();
}

// Vegetable inherits Edible
// So Vegetable is Edible
class Vegetable implements Edible{
	public void eat() {
		System.out.println("Vegetables are edible");
	}
}

// Though Tomato doesn't inherits Edible
// But it inherits Vegetable, so Tomato is Edible too
class Tomato extends Vegetable {
	
}

public class MultiLevelInhertiance {
	public static void main(String[] args) {
		Tomato tomato = new Tomato(); 
		tomato.eat();
	}
}
