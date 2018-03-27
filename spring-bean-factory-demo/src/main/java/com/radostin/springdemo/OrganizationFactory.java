package com.radostin.springdemo;

public class OrganizationFactory {
	public Organization getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking instace factory method........");
		return new Organization(companyName, yearOfIncorporation);
	}

}
