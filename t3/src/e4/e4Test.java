/**
 * 
 */
package e4;

import org.junit.Test;

/**
 * @author Christian db
 *
 */


	public class e4Test {

		Conversor conversor = new Conversor();

		@Test
		public void testForConvert_I_to_int() {
			int i = conversor.romanToDec("I");
			System.out.println( "I " + i );
		}
		
		
		@Test
		public void testForConvert_DC_to_int() {
			int i = conversor.romanToDec("DC");
			System.out.println( "DC " + i );
		}
		
		@Test
		public void testForConvert_18_to_Roman(){
			String i = conversor.decToRoman(18);
			System.out.println( "18 " + i );
		}
		@Test
		public void testForConvert_600_to_Roman(){
			String i = conversor.decToRoman(600);
			System.out.println( "600 " + i );
		}
		@Test
		public void testForConvert_XVIII_to_int() {
			int i = conversor.romanToDec("XVIII");
			System.out.println( "XVIII " + i );
		}
	}

