package com.radostin.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.radostin.springdemo.service.BusinessService;

@Component("myorg")
public class Organization {

	@Value("${nameOfCompany}")
	private String companyName;

	@Value("${startUpYear}")
	private int yearOfIncorporation;

	@Value("${postalCode}")
	private String postalCode;

	@Value("${empCount:22222}")
	private int employeeCount;

	@Value("${corporateSlogan: We build world class software!}")
	private String slogan;

	private String missionStatement;

	@Autowired
	private Environment env;

	private BusinessService businessService;

	public Organization() {
		System.out.println("Default constructor called.");
	}

	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor called.");
	}

	public String corporateSlogan() {
		missionStatement = env.getProperty("statement");
		return missionStatement + " and also " + slogan;
	}

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}

	// public void initialize() {
	// System.out.println("organization: initialize method called");
	// }
	//
	// public void destroy() {
	// System.out.println("organization: destroy method called");
	// }

	public void postConstruct() {
		System.out.println("organization: postConstruct called........");
	}

	public void preDestroy() {
		System.out.println("organization: preDestroy called........");
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode called.");
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount called.");
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan called.");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService called.");
	}

	public String corporateService() {
		return businessService.offerService(companyName);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}

}
