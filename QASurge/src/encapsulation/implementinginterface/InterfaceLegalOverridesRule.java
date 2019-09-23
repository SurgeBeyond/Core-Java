package encapsulation.implementinginterface;

interface UPI{
	public void onlineTransaction();
}

// Follow all of the legal override rules.

class Rupay implements UPI{
	public void onlineTransaction() {
		System.out.println("RuPay");
	}	
}

public class InterfaceLegalOverridesRule {
	
	public static void main(String[] args) {
		Rupay pay = new Rupay();
		pay.onlineTransaction();
	}

}
