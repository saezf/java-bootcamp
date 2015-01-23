/**
 * 
 */
package e2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author Christian db
 *
 */
public class WordWrappingTest {

	@Test
	public void firstTest() {
		ArrayList<String> Test = WordWrapping.getWordWrappedRows(3,"a b c d e f");
		//System.out.println(WordWrapping.toString(Test));
		assertEquals("a b\nc d\ne f" , WordWrapping.toString(Test));
	}
	@Test
	public void secondTest() {		
		assertEquals("Text with less than 60 characters", WordWrapping.toString(60,"Text with less than 60 characters"));
	}
	@Test
	public void thirdTest() {
		assertEquals("Hello\nWord!" , WordWrapping.toString(7,"Hello Word!"));
	}
	@Test
	public void veryLong() {
		ArrayList<String> Test = WordWrapping.getWordWrappedRows(5,"I'd rather use print than assertEquals");
		assertEquals("I'd\nrathe\nr use\nprint\nthan\nasser\ntEqua\nls" , WordWrapping.toString(Test));
	}


}
