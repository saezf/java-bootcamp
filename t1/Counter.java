	/**
 * 
 */
package t1;

/**
 * @author Christian db
 *
 */
public class Counter {


		private static Counter counter = null;
		private static long count = 1;
	 


		public static Counter getInstance() {
			if (counter == null) {
				counter = new Counter();
			}
			return counter;
		}
/**
 * 
 * @param oldCount 
 * @return oldCount + 1
 */
		public static Counter getInstance(int oldCount) {
			if (counter == null) {
				counter = new Counter();
				count = oldCount;
			}
			return counter;
		}
		public long getNumber() {
			return ++count;
		}
		/**
		 * 
		 * @return The internal count number without incrementing it
		 */
		public long getCurrentCount() {
			return count;
		}
	}