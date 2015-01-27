/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;
import java.util.ArrayList;
import java.util.List;


public class ShoppingCartImp implements ShoppingCartService {
	
	List<Item> itemList = new ArrayList<Item>();

	public void removeItem(Item itemToRemove) {
		itemList.remove(itemToRemove);
		
	}

	public String getItems() {
		return itemList.toString();
	}

	public void addItem(Item newItem) {
		itemList.add(newItem);
		
	}

	public void clearShoppingCart() {
		itemList.clear();
		
	}
	
	
}
