package com.bootcamp;

public class BookVariousAuthors{	// save as "BookVariousAuthors.java"
		// private instance variable, not accessible from outside this class
		private String name;
		private Author[] authors ;
		private Double price;
		private int qtyInStock = 0;
		
		public BookVariousAuthors(String name, Author[] authors, double price) {
			this.name = name;
			this.authors = authors;
			this.price = price;
			this.qtyInStock = 0;
		}
		
		public BookVariousAuthors(String name, Author[] authors, double price, int qtyInStock) {
			this.name = name;
			this.authors = authors;
			this.price = price;
			this.qtyInStock = qtyInStock;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Author[] getAuthors() {
			return authors;
		}
		public void setAuthors(Author[] authors) {
			this.authors = authors;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public int getQtyInStock() {
			return qtyInStock;
		}
		public void setQtyInStock(int qtyInStock) {
			this.qtyInStock = qtyInStock;
		}
		
		public String toString(){
			return "Book: " + name + " by " + authors;
		}
		
		public String printAuthors(){
			if(authors.length == 1){
				return "The author is: " + authors[0];
			}else{
			return "The Authors are: " + for(i = 0,i < authors.length,i++){
				System.out.print(authors[i]);
			}
		}
}