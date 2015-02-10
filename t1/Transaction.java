/**
 * 
 */
package t1;

import java.util.Iterator;
import java.util.Set;


/**
 * @author Christian db
 *
 */
public  class Transaction implements Subject {

	private ShoppingCart cart;
	private Counter counter;
	Set<Observer> mailList;
	public Transaction(ShoppingCart cart){counter = new Counter(); 

	this.cart = cart; mailList.add(new MailListObserver());}
	
	public ShoppingCart getCart() {
		return cart;
	}
	
	public void payCart(ShoppingCart cart) {
		
		counter.getNumber();
		
			// TODO Auto-generated method stub
			
		
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	/* (non-Javadoc)
	 * @see t1.Subject#addObserver(t1.Observer)
	 */
	@Override
	public void addObserver(Observer MailList) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see t1.Subject#removeObserver(t1.Observer)
	 */
	@Override
	public void removeObserver(Observer MailList) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see t1.Subject#doNotify()
	 */
	@Override
	public void doNotify() {
		// TODO Auto-generated method stub
		Iterator<Observer> it = mailList.iterator();
		while (it.hasNext()) {
			Observer obs = it.next();
			obs.doUpdate();
		}
	}

}
