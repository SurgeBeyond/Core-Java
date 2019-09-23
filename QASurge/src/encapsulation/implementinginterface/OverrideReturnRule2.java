package encapsulation.implementinginterface;

// Array as an return type

class Ocean{
	public String[] getNames() {
		return new String[] {"Inidan Ocean", "Bay Of Bengal"};
	}
}

public class OverrideReturnRule2 {

	public static void main(String[] args) {
		Ocean ocean = new Ocean();
		String[] names = ocean.getNames();
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
