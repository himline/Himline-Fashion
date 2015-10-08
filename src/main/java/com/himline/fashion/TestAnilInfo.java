package com.himline.fashion;

/*
 * Test Info program for GitHub
 * @author Anil Rana
 * GitHub: anilra
 * 
 * commented on development branch
 * 
 */

public class TestAnilInfo {

	String firstName;
	String lastName;
	String company;
	
	// Get First Name
	public String getFirstName() {
		return firstName;
	}
	
	// Set First Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Get Last Name
	public String getLastName() {
		return lastName;
	}

	// Set Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Get Company
	public String getCompany() {
		return company;
	}

	// Set Company
	public void setCompany(String company) {
		this.company = company;
	}

	// Get Full Name
	public void getFullName(){
		System.out.println("Full Name: "+getFirstName() +" "+ getLastName());
	}
	
	// Get Full Info
	public void getFullInfo(){
		getFullName();
		System.out.println("Company Name: "+getCompany());
	}
		
	public static void main(String[] args) {
		
		// Instantiate Object
		TestAnilInfo obj = new TestAnilInfo();
		
		// Input Values
		obj.setFirstName("Anil");
		obj.setLastName("Rana");
		obj.setCompany("Himline");
		
		// Output Result
		System.out.println("-----------Full Info -----------");
		obj.getFullInfo();
	}
}
