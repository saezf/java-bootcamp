package com.bootcamp;

public class TestBook {        // save as "TestBook.java"
	public static void main(String[] args) {
		Author anAuthor = new Author("Jean Pierre Meinadier", "jpmeinadier@foo.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		// Use an anonymous instance of Author
		Book anotherBook = new Book("more Java for dummy", new Author("Jose Perez", "jp@foo.com", 'm'), 50.99, 100);
		
		/* Version anterior con getAuthor().getXxx()
		*System.out.println("Author Name: " + aBook.getAuthor().getName() + " Email: " + aBook.getAuthor().getEmail() );
		*System.out.println("Author Name: " + anotherBook.getAuthor().getName() + " Email: " + anotherBook.getAuthor().getEmail() );
		**/
		
		// Usando getters de la clase Book
		System.out.println("Author Name: " + aBook.getAuthorName() + " Email: " + aBook.getAuthorEmail());
		System.out.println("Author Name: " + anotherBook.getAuthorName() + " Email: " + anotherBook.getAuthorEmail() );
	}
}