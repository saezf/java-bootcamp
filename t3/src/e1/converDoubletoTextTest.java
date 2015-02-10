/**
 * 
 */
package e1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Christian db
 *
 */


public class converDoubletoTextTest {

	@Test
	public void BigNumber() {
		assertEquals("Eight hundred seventy-two million one hundred thirty-one thousand "
				+ "two hundred thirty-one and 12/100 dollars",
				converDoubletoText.convert(872131231.123));
	
	}
	
	@Test
	public void Negative(){
	
		assertEquals("Minus Thirty-one and 12/100 dollars",
				converDoubletoText.convert(-31.12));
	
	}
	@Test
	public void roundingZero(){
		assertEquals("Zero dollars",
				converDoubletoText.convert(0.00123));
	
	}
	@Test
	public void onlyDecimal(){
		assertEquals("Zero and 57/100 dollars",
				converDoubletoText.convert(0.57));
	
	}
	@Test
	public void onlyInteger(){
		assertEquals("Thirty-one dollars",
				converDoubletoText.convert(31));
	
	}
	// yes this way is much easier to see whats happening than asserts..
	public void Mix(){
		System.out.println("Mix");
double i = 0.5701;
		System.out.println("imput: " + i +" ouput: "+ converDoubletoText.convert(i));
 i = 31;
		System.out.println("imput: " + i +" ouput: "+ converDoubletoText.convert(i));
	}
	
	public void integer4DigitSkipingSome(){
		System.out.println("integer4DigitSkipingSome");
		for (int i = 9999; i< 10000; i= i+39)
		{
		System.out.println("imput: " + i +" ouput: "+ converDoubletoText.convert(i));
		}
	
	}
	
	public void withdecimalsandNegatives(){
		System.out.println("withdecimals");
		for (double i = -1.1; i< 2; i= i+0.09)
		{
		System.out.println("imput: " + i +" ouput: "+ converDoubletoText.convert(i));
		}
	
	}
}
