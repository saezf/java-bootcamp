/**
 * 
 */
package e2;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author Christian db
 *
 */
public class WordWrappingTest {

//	@Test
//	public void splitting() {
//		
//		String Test[] = e2.getWordWrappedRows(1,"Not yet implemented");
//		for (String item : Test){
//		System.out.println(	item);
//		}
//	}
	@Test
	public void splittingToFit() {
		ArrayList<String> Test = e2.getWordWrappedRows(3,"a b c d e");
		for (String item : Test){
		System.out.println(	item);
		}
	}
	@Test
	public void other() {
		ArrayList<String> Test = e2.getWordWrappedRows(7,"Hello Word!");
		for (String item : Test){
		System.out.println(	item);
		}
	}
	@Test
	public void veryLong() {
		ArrayList<String> Test = e2.getWordWrappedRows(5,"asd,kjahsjhdaskjhdaskjhdaskjh asldkjasdljasdklasjdklasj aslkdj asdlkj asdsaasdsda");
		for (String item : Test){
		System.out.println(	item);
		}
	}

}
