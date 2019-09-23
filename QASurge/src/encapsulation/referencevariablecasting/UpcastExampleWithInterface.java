package encapsulation.referencevariablecasting;

interface Code {
}

class Java implements Code {
}

public class UpcastExampleWithInterface {

	public static void main(String[] args) {
		Code code1 = new Java(); // Implicit
		Code code2 = (Code) new Java(); // Explicit
	}
}
