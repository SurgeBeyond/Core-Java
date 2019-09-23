package encapsulation.polymorphism;

public class GeneralRulesPolymorphism {

	public static void mmain(String[] args) {

		// A reference variable can be of only one type, and once declared, that type
		// can never be changed
		GeneralRulesPolymorphism poly1;
		Object poly1;

		// A reference is a variable, so it can be reassigned to other objects, (unless
		// the reference is declared final).
		GeneralRulesPolymorphism poly2 = new GeneralRulesPolymorphism();
		poly2 = new GeneralRulesPolymorphism();
	}

}
