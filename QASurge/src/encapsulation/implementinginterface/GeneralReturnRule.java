package encapsulation.implementinginterface;

// In a method with an object reference return type, you can return any
// object type that can be implicitly cast to the declared return type.


public class GeneralReturnRule {


	public int[] getObject() {
		int[] nums = { 1, 2, 3 };
		return nums; // Return an int array, which is still an object
	}
	
	public static void main(String[] args) {
		
		GeneralReturnRule ob = new GeneralReturnRule();
		int[] array = ob.getObject();
		
		for(int no: array) {
			System.out.println(no);
		}
	}

}
