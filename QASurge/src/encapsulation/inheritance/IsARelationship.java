package encapsulation.inheritance;

class LivingBeing {

	public void livingBeing() {
		System.out.println("Living Being");
	}
}

// Bird is a type of living being
class Bird extends LivingBeing {
	public void bird() {
		System.out.println("Bird");
	}
}

// Sparrow is type of a bird
class Sparrow extends Bird{
	public void sparrow() {
		System.out.println("Sparrow");
	}
}

public class IsARelationship {

}
