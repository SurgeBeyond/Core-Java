package encapsulation.overload;

public class InvocationOfOverloadedMethodsRule {
	
	void method1(int number) {
		System.out.println("Overloaded method with argument as an INT");
	}
	
	void method1(float number) {
		System.out.println("Overloaded method with argument as an FLOAT");
	}
	
	void method1(Double number) {
		System.out.println("Overloaded method with argument as an DOUBLE");
	}
	
	public static void main(String[] args) {
		InvocationOfOverloadedMethodsRule rule = new InvocationOfOverloadedMethodsRule();
		rule.method1(1);
		rule.method1(1.1f);
		rule.method1(1.1d);
	}

}
