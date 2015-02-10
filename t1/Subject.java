/**
 * 
 */
package t1;



	public interface Subject {

		public void addObserver(Observer weatherObserver);

		public void removeObserver(Observer weatherObserver);

		public void doNotify();

	}