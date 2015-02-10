package com.bootcamp;

public class Author {           // save as "Author.java"
	// private instance variable, not accessible from outside this class
	private String name;
	private String email;
	private char gender;
	   
	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	   
	// Setter for instance variable name
	public void setName(String name) {
		this.name = name;
	}
	 
	// Setter for instance variable email
	public void setEmail(String email) { 
		this.email = email;
	}
	
	// Setter for instance variable email
	public void setGender(char gender) { 
		this.gender = gender;
	}
	
	// A public method for retrieving the name
	public String getName() {
		return name; 
	}
	
	// A public method for retrieving the email
	public String getEmail() {
		return email; 
	}
	
	// A public method for retrieving the gender
	public char getGender() {
		return gender; 
	}
	
	public String toString() {
		return name + " " + email + " " + gender;
	}
}