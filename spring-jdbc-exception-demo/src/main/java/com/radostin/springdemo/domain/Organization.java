package com.radostin.springdemo.domain;

public class Organization {
	private int id;
	private String compannyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompannyName() {
		return compannyName;
	}

	public void setCompannyName(String compannyName) {
		this.compannyName = compannyName;
	}

	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", compannyName=" + compannyName + ", yearOfIncorporation="
				+ yearOfIncorporation + ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan="
				+ slogan + "]";
	}

}
