package com.qasurge.java.tutorial.encapsulation;

public class Company2 {

	private String companyName;
	private int numberOfEmployees;

	public void setNumberOfEmployees(int number) throws Exception {
		if (number > 0) {
			numberOfEmployees = number;
		} else {
			throw new Exception("Invalid Input");
		}
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

}

class CompanyExample2 {

	public static void main(String[] args) {
		try {
			Company2 company = new Company2();
			company.setNumberOfEmployees(-100);
			System.out.println(company.getNumberOfEmployees());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
