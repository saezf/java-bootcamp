/**
 * 
@author Rodrigo Cardozo
 *
 */


package com.bootcamp.ServiceShoppingCartAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ShoppingCartProxy implements ShoppingCartService{
	@Autowired
	ShoppingCartService implementation;
	
	
	
	public ShoppingCartProxy() {
		}


	
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
