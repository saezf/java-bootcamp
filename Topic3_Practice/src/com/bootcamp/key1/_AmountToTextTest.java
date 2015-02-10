package com.bootcamp.key1;

import static org.junit.Assert.*;

import org.junit.Test;

public class _AmountToTextTest {

	//You can convert number between 1 and 999,999,999.99
	
	// Try with 0's values
	@Test
	public void testFor_Zero_Number() {
		assertEquals(new Check(0).toText(),"Error - Insert values betwwen 1 and 999999999");
		assertEquals(new Check(0.65).toText(),"Error - Insert values betwwen 1 and 999999999");
	}
	
	//Cycle Test for numbers with length = 1 and 0 numbers in the fraction part
	@Test
	public void testFor_1_Number() {
		//fail("Not yet implemented");
		for(int i=1;i<10;i++){
			switch (i){
				case 1:
					assertEquals(new Check(i).toText(),"One dollars");
					break;
				case 2:
					assertEquals(new Check(i).toText(),"Two dollars");
					break;
				case 3:
					assertEquals(new Check(i).toText(),"Three dollars");
					break;
				case 4:
					assertEquals(new Check(i).toText(),"Four dollars");
					break;
				case 5:
					assertEquals(new Check(i).toText(),"Five dollars");
					break;
				case 6:
					assertEquals(new Check(i).toText(),"Six dollars");
					break;
				case 7:
					assertEquals(new Check(i).toText(),"Seven dollars");
					break;
				case 8:
					assertEquals(new Check(i).toText(),"Eight dollars");
					break;
				case 9:
					assertEquals(new Check(i).toText(),"Nine dollars");
					break;
			}
		}
		assertEquals(new Check(1.23).toText(),"One and 23/100 dollars");
	}
	
	@Test
	public void testFor_2_Number() {
		//fail("Not yet implemented");
		assertEquals(new Check(12).toText(),"Twelve dollars");
		assertEquals(new Check(23).toText(),"Twenty-Three dollars");
		assertEquals(new Check(10).toText(),"Ten dollars");
		assertEquals(new Check(41.2345).toText(),"Forty-One and 23/100 dollars");
	}
	@Test
	public void testFor_3_Number() {
		assertEquals(new Check(125).toText(),"One Hundred Twenty-Five dollars");
		assertEquals(new Check(256.98).toText(),"Two Hundred Fifty-Six and 98/100 dollars");
	}
	
	@Test
	public void testFor_4_Number() {
		assertEquals(new Check(1765).toText(),"One Thousand Seven Hundred Sixty-Five dollars");
		assertEquals(new Check(9998.74).toText(),"Nine Thousand Nine Hundred Ninety-Eight and 74/100 dollars");
	}
	
	@Test
	public void testFor_5_Number() {
		assertEquals(new Check(77765).toText(),"Seventy-Seven Thousand Seven Hundred Sixty-Five dollars");
		assertEquals(new Check(459998.74).toText(),"Four Hundred Fifty-Nine Thousand Nine Hundred Ninety-Eight and 74/100 dollars");
	}
	
	@Test
	public void testFor_6_Number() {
		assertEquals(new Check(438217765).toText(),"Four Hundred Thirty-Eight Millon Two Hundred Seventeen Thousand Seven Hundred Sixty-Five dollars");
		assertEquals(new Check(999459998.74).toText(),"Nine Hundred Ninety-Nine Millon Four Hundred Fifty-Nine Thousand Nine Hundred Ninety-Eight and 74/100 dollars");
	}
}