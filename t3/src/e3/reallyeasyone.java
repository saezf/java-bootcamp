/**
 * 
 */
package e3;

import org.junit.Test;

/**
 * @author Christian db
 *
 */
public class reallyeasyone {

	@Test
	public void test() {
		recentFiles Thelist = new recentFiles();
		for (int i = 1; i < 17; i++){ //yup i dont care what James Shore does on his videos i still think you can't evaluate somethings with the assertEquals or its just too long to write.
			
			Thelist.add(""+i);}
		for (String item : Thelist.items){
			System.out.println(item);
		}
		System.out.println("Size : " + Thelist.items.size());
	}

}
