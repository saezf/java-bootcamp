/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;

public class ShoppingCartProxy implements ShoppingCartService{
	ShoppingCartService implementation;
	
	
	
	protected ShoppingCartProxy(ShoppingCartService imp) {  
	        this.implementation = imp;  
	    }



	public void removeItem(Item itemToRemove) {
		implementation.removeItem(itemToRemove);
		
	}



	public String getItems() {
		return implementation.getItems();
	}



	public void addItem(Item newItem) {
		implementation.addItem(newItem);
		
	}



	public void clearShoppingCart() {
		implementation.clearShoppingCart();
		
	}

	
	
}
