package encapsulation.override;

class Bird {
	protected void fly() {
	}
}

//The access level can't be more restrictive than the overridden method's.
class Sparrow extends Bird {
	/*
	 * private void fly() { }
	 */
}

//The access level CAN be less restrictive than that of the overridden method.
class Eagel extends Bird {
	public void fly() {
	}
}

//Instance methods can be overridden only if they are inherited by the subclass.

public class OverrideAccessLevelMethodRule1 {

}
