package com.bootcamp.wordwrapping;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void test() {
		
		assertEquals(WordWrapping.wordWrap("something",3),"som\neth\ning");
		
	}
	
	@Test
	public void test2() {
		
		assertEquals(WordWrapping.wordWrap("2134123412341234",2),"21\n34\n12\n34\n12\n34\n12\n34");
		
	}
	
	@Test
	public void test3() {
		
		assertEquals(WordWrapping.wordWrap("Excelent",5),"Excel\nent");
		
	}
}
