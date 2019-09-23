package encapsulation.overload;

// Overloaded methods CAN change the access modifier.
public class OverloadAccessModifierRule {

	private int tutorials() {
		return 1;
	}

	int tutorials(int number) {
		return number;
	}

	protected String tutorials(String name) {
		return name;
	}

	public String tutorials(String name, int number) {
		return name+number;
	}

	public static void main(String[] args) {
		OverloadAccessModifierRule rule = new OverloadAccessModifierRule();
		
		System.out.println(rule.tutorials());
		
		int number = rule.tutorials(3);
		System.out.println(number);
		
		String name = rule.tutorials("QASurge");
		System.out.println(name);
		
		String name2 = rule.tutorials("QASurge"+ 100);
		System.out.println(name2);
	}

}
