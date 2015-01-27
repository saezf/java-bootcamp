/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;

public interface ShoppingCartService {
	
	public void removeItem(Item itemToRemove);
	public String getItems();
	void addItem(Item newItem);
	public void clearShoppingCart();
	
}
