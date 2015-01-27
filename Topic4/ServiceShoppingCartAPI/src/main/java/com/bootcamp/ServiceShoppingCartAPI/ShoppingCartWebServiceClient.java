/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;


public class ShoppingCartWebServiceClient implements ShoppingCartService {
	ShoppingCartService imp = new ShoppingCartImp();

	public void removeItem(Item itemToRemove) {
		imp.removeItem(itemToRemove);
		
	}

	public String getItems() {
		return imp.getItems();
	}

	public void addItem(Item newItem) {
		imp.addItem(newItem);
		
	}

	public void clearShoppingCart() {
		imp.clearShoppingCart();
		
	}
	
	

	
}
