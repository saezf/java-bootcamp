/**
 * 
 */
package e3;

import java.util.ArrayList;

/**
 * @author Christian db
 *
 */
public class recentFiles {
public  ArrayList<String> items = new ArrayList<String>(); //Stack<String> would do too.
private final static int LIST_LENGTH = 15;

	/**
	 * @param string
	 */
	public void add(String path) {
		// TODO Auto-generated method stub
		if (!items.contains(path)){
			items.add(0, path);
		

			if(items.size() > LIST_LENGTH)
				items.remove(items.size() - 1);
		}
		
	}
 
}
