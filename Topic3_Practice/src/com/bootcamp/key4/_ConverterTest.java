package com.bootcamp.key4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
	
public class _ConverterTest {
	
	private RomanNumber rn;
	private ArabicNumber an;
	
	@Before
	public void setup() {
		rn = new RomanNumber();
		an = new ArabicNumber();
	}
	
	
	@Test
	public void Convert_To_Roman() {
		assertEquals(rn.convertToRoman(1),"I");
		assertEquals(rn.convertToRoman(1456),"MCDLVI");
	}

	@Test
	public void Convert_To_Arabic() {
		assertEquals(an.convertToArabic("I"),1);
		assertEquals(an.convertToArabic("MCDLVI"),1456);
	}
}
