package com.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartServiceProxy implements ShoppingCartService{
	@Autowired
	ShoppingCartService implementation;
	
	public ShoppingCartServiceProxy() {
	}
	
    protected ShoppingCartServiceProxy(ShoppingCartService imp) {  
        this.implementation = imp;  
    }

	public String getItems() {
		return implementation.getItems();
	}

	public void addItem(Product newProduct) {
		implementation.addItem(newProduct);
		
	}

	public void removeItem(Product productToRemove) {
		implementation.removeItem(productToRemove);
	}

	public List<Product> getListItems() {
		return implementation.getListItems();
	}  

}
