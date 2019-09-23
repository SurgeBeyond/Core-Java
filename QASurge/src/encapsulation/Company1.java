package encapsulation;

public class Company1 {

	public String companyName;
	public int numberOfEmployees;
	
}

class CompanyExample1{
	
	public static void main(String[] args) {
		Company1 company =new Company1();
		
		// Legal but bad
		company.companyName = "QASurge";
		company.numberOfEmployees =-100;
		
		System.out.println(company.companyName);
		System.out.println(company.numberOfEmployees);
	}
}
