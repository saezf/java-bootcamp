package com.bootcamp;

public class TestAuthor {        // save as "TestAuthor.java"
	public static void main(String[] args) {
		Author anAuthor = new Author("Homero Simpson", "homero@cbs.com", 'm');
		System.out.println(anAuthor);   // call toString()
		anAuthor.setEmail("homero@simpson.com");
		System.out.println(anAuthor);
	}
}