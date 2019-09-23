package encapsulation.referencevariablecasting;

class Characters {
}

class Words extends Characters {
}

public class UpcastExample {

	public static void main(String[] args) {
		Characters characters1 = new Words(); // Implicit
		Characters characters2 = (Characters) new Words(); // Explicit
	}
}
