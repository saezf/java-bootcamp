package com.bootcamp;

public class Book {           // save as "Book.java"
	// private instance variable, not accessible from outside this class
	private String name;
	private Author author;
	private Double price;
	private int qtyInStock;
	
	public Book (String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = 0;
	}
	
	public Book (String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// A public method for retrieving the name
	public String getName() {
		return name; 
	}
	
	// A public method for retrieving the author
	public Author getAuthor() {
		return author; 
	}
	
	// A public method for retrieving the price
	public Double getPrice() {
		return price; 
	}
	
	// A public method for retrieving the quantity stock
	public int getQtyInStock() {
		return qtyInStock; 
	}
	
	// Setter for instance variable qtyInStock
	public void setRadius(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	// A public method for retrieving the Author's Name
	public String getAuthorName() {
		return getAuthor().getName(); 
	}
	
	// A public method for retrieving the Author's Email
	public String getAuthorEmail() {
		return getAuthor().getEmail(); 
	}
	
	// A public method for retrieving the Author's Gender
	public char getAuthorGender() {
		return getAuthor().getGender(); 
	}
	
	public String toString() {
		return name + " by " + author ;
	}
}