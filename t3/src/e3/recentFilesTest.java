/**
 * 
 */
package e3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Christian db
 *
 */
public class recentFilesTest {

	@Test
	public void test() {
		recentFiles Thelist = new recentFiles();
		for (int i = 1; i < 17; i++){ 
			Thelist.add("Filepath"+i);}
//		for (String item : Thelist.items){
//			//yup i dont care what James Shore does on his videos 
//			//i still think you can't evaluate some things with the assertEquals 
//			//or its just too long to write.
//			System.out.println(item);
//		}
		assertEquals(Thelist.items.get(0).toString() ,"Filepath16");
		assertEquals(Thelist.items.get(14).toString() ,"Filepath2");
		assertEquals(Thelist.items.size() ,15);
		
	}

}
