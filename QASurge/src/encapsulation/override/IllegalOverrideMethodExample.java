package encapsulation.override;

import java.io.IOException;

public class IllegalOverrideMethodExample {

	// Access modifier is more restrictive
	// Overidden method: public void example1() {}
	private void example1() {}

	// Declares a checked exception not defined by superclass version
	// Overidden method: public void example2(){}
	public void example2() throws IOException{}
	
	// A legal overload, not an override, because the argument list changed
	// Overidden method: public void example3() {}
	public void example3(String name) {}
	
	// Not an override because of the return type, not an overload
	// either because there’s no change in the argument list
	// Overidden method: public int example4() {}
	public void example4() {}
}

