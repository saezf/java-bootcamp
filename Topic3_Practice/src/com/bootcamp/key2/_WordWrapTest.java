package com.bootcamp.key2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bootcamp.key2.WordWrap;

public class _WordWrapTest {

	@Test
	public void String_Less_ThanOrEqual_Row_Lenght() {
		//fail("Not yet implemented");
		assertEquals(new WordWrap("Hello",50).getWrap("Hello"),"Hello");
		assertEquals(new WordWrap("Hello",5).getWrap("Hello"),"Hello");
	}
	
	@Test
	public void String_More_Than_Row_Lenght() {
		//fail("Not yet implemented");
		assertEquals(new WordWrap("Hello",3).getWrap("Hello"),"Hel,lo");
		assertEquals(new WordWrap("Hello",1).getWrap("Hello"),"H,e,l,l,o");
		assertEquals(new WordWrap("Hello World!",1).getWrap("Hello World!"),"H,e,l,l,o, ,W,o,r,l,d,!");
	}
}
