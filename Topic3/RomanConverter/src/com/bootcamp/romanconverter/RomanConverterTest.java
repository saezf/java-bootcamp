package com.bootcamp.romanconverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {

	

	@Test
	public void testForConvert_I_to_1() {
		assertEquals(new Roman("I").toDecimal(),1);
	}
	
	@Test
	public void testForConvert_II_to_2() {
		assertEquals(new Roman("II").toDecimal(),2);
	}
	
	@Test
	public void testForConvert_IV_to_5() {
		assertEquals(new Roman("DC").toDecimal(),600);
	}
	
	@Test
	public void testForConvert_1_to_I(){
		assertEquals(new Decimal(1).toRoman(),"I");
	}
	
	@Test
	public void testForConvert_2000_to_MM(){
		assertEquals(new Decimal(2000).toRoman(),"MM");
	}
	
	@Test
	public void testForConvert_2015_to_MMXV(){
		assertEquals(new Decimal(2015).toRoman(),"MMXV");
	}
}
