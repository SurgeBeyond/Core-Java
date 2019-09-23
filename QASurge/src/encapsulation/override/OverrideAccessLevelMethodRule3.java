package encapsulation.override;

//A subclass in a different package can override only those non-final methods marked public
// or protected (since protected methods are inherited by the subclass).
public class OverrideAccessLevelMethodRule3 {

	public void testPublic() {
		System.out.println("Test Public");
	}

	protected void testProtected() {
		System.out.println("Test Protected");
	}

	void testDefault() {
		System.out.println("Test Default");
	}

	private void testPrivate() {
		System.out.println("Test Private");
	}

}
