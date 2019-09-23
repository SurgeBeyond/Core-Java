package encapsulation.override2;

import encapsulation.override.OverrideAccessLevelMethodRule3;

public class OverrideAccessLevelMethodRule3Test extends OverrideAccessLevelMethodRule3 {

	// Overridden method
	public void testPublic() {
		System.out.println("Test Public");
	}

	// Overridden method
	protected void testProtected() {
		System.out.println("Test Protected");
	}

	// New method
	void testDefault() {
		System.out.println("Test Default");
	}

	// New method
	private void testPrivate() {
		System.out.println("Test Private");
	}
}
