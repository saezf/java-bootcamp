/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;

import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
	
	public void removeItem(Item itemToRemove);
	public String getItems();
	void addItem(Item newItem);
	public void clearShoppingCart();
	
}
