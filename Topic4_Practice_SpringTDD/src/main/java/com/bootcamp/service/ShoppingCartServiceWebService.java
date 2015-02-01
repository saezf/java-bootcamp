package com.bootcamp.service;

import java.util.List;

public class ShoppingCartServiceWebService implements ShoppingCartService{
	ShoppingCartService imp = new ShoppingCartServiceImpl();


	public String getItems() {
		return imp.getItems();
	}

	public void addItem(Product newProduct) {
		imp.addItem(newProduct);
	}

	public void removeItem(Product productToRemove) {
		imp.removeItem(productToRemove);
	}

	public List<Product> getListItems() {
		return imp.getListItems();
	}
}
