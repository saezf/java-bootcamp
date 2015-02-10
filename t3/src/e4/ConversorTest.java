/**
 * 
 */
package e4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Christian db
 *
 */


	public class ConversorTest {

		Conversor conversor = new Conversor();

		@Test
		public void testForConvert_I_to_int() {
			int i = conversor.romanToDec("I");
			assertEquals(1,i);
		}
		
		
		@Test
		public void testForConvert_DC_to_int() {
			int i = conversor.romanToDec("DC");
			assertEquals(600,i);
		}
		
		@Test
		public void testForConvert_18_to_Roman(){
			String i = conversor.decToRoman(18);
			assertEquals("XVIII",i);
		}
		@Test
		public void testForConvert_600_to_Roman(){
			String i = conversor.decToRoman(600);
			assertEquals("DC",i);
		}
		@Test
		public void testForConvert_XVIII_to_int() {
			int i = conversor.romanToDec("XVIII");
			assertEquals( 18 , i );
		}
	}

