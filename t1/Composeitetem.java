/**
 * 
 */
package t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public abstract class Composeitetem implements ListableItem ,Subject  {
	List<ListableItem> offer = new ArrayList<ListableItem>();
	Set<Observer> mailList;
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

public List<ListableItem> getItems() {
	return getItems();
}
public void setItems(List<ListableItem> items) {
	setItems(items);
}
public List<ListableItem> getOffer() {
	return offer;
}
public void setOffer(List<ListableItem> offer) {
	this.offer = offer;
}

/* (non-Javadoc)
 * @see t1.Subject#addObserver(t1.Observer)
 */
@Override
public void addObserver(Observer weatherObserver) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see t1.Subject#removeObserver(t1.Observer)
 */
@Override
public void removeObserver(Observer weatherObserver) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see t1.Subject#doNotify()Set<Observer> mailList;
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