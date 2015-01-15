package t1;

import java.util.List;

import t1.payment.PaymenType;


public class ShoppingCart {
List<ListableItem> items;
PaymenType paymenType;

public double getTotal() {
	 return paymenType.getTotal(items);
	 
}
public List<ListableItem> getItems() {
	return items;
}

public void setItems(List<ListableItem> items) {
	this.items = items;
}
public void addItem(ListableItem item) {
	this.items.add(item);
	 
}
public void remomveItem(ListableItem item) {
	this.items.remove(item);
	 
}

}
