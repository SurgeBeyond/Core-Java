package encapsulation.overload;

class OS {

	void runApplication() {
		System.out.println("OS");
	}
}

class Android extends OS {

	void runApplication() {
		System.out.println("Override");
	}

	void runApplication(String name) {
		System.out.println(name);
	}
}

public class PolymorphismInOverloadOverride {

	public static void main(String[] args) {
		OS os = new OS();
		os.runApplication();
		
		Android android = new Android();
		android.runApplication();
		
		OS android2 = new Android();
		android2.runApplication();
		
		android.runApplication("NotePad");
		
		//os.runApplication("NotePad");
		
		OS os2 = new Android();
	//	os2.runApplication("NotePad");
	}

}
