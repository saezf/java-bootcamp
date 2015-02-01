package com.bootcamp.service;


import java.util.ArrayList;
import java.util.List;


public class ShoppingCartServiceImpl implements ShoppingCartService{
	private List<Product> itemList = new ArrayList<Product>();
	
	protected ShoppingCartServiceImpl(){}
	
	public String getItems() {
		return itemList.toString();
	}

	public void addItem(Product newProduct) {
		itemList.add(newProduct);
	}

	public void removeItem(Product productToRemove) {
		itemList.remove(productToRemove);
	}

	public List<Product> getListItems() {
		return itemList;
	}
}
