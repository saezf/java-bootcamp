package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
	private User user;
	List<Item> items;
	
	public ShoppingCart(User user){
		this.user = user;
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item); 
	}
	
	public void removeItem(Item item){
		this.items.remove(item); 
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum +=item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod){
		int totalAmount = calculateTotal();
		paymentMethod.pay(totalAmount);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	// Required in the point 4 of the exercise
	public void ListAllItems(){
		for(Item i : items){
			System.out.println(i);
		}
	}
}