package com.bootcamp.AmountToTextConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountNumberToTextTest {

	@Test
	public void test() {
		assertEquals(new Amount(100.1545).toText(), "one hundred 15/100 dollars");
	}
	
	@Test
	public void test2() {
		assertEquals(new Amount(2014).toText(), "two thousand fourteen 0/100 dollars");
	}
}
