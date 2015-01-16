/**
 * 
 */
package e1;
import org.junit.Test;

/**
 * @author Christian db
 * TDD is not my thing, I really thing it would be a lot more easy to just use  intput % 1 , 10 100 and recursion
 * and it would be faster using a hash function..
 */


public class converDoubletoTextTest {

	
	public void integer1Digit() {
		System.out.println("integer1Digit");
	for (int i = 0; i< 10; i++)
	{
			
	System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
	}
	}
	
	public void integer2Digit(){
		System.out.println("integer2Digit");
		for (int i = 9; i< 100; i++)
		{
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
		}
	
	}
	
	public void integer3Digit(){
		System.out.println("integer3Digit");
		for (int i = 99; i< 1000; i++)
		{
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
		}
	
	}
	@Test
	public void Mix(){
		System.out.println("Mix");
double i = 872131231.123;
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
 i = -31.122131233;
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
	}
	@Test
	public void integer4DigitSkipingSome(){
		System.out.println("integer4DigitSkipingSome");
		for (int i = 9999; i< 10000; i= i+39)
		{
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
		}
	
	}
	@Test
	public void withdecimalsandNegatives(){
		System.out.println("withdecimals");
		for (double i = -1.1; i< 2; i= i+0.09)
		{
		System.out.println("imput: " + i +" ouput: "+ e1.convert(i));
		}
	
	}
}
