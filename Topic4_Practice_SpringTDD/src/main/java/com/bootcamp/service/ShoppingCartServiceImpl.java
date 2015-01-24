package com.bootcamp.service;


import java.util.ArrayList;

import com.bootcamp.shoppingcart.ProductDetails;

public class ShoppingCartServiceImpl implements ShoppingCartService{
	private ProductDetails listDetails = new ProductDetails();
	
	protected ShoppingCartServiceImpl(){}
	
	public ArrayList<String> getAllItems() {
		return listDetails.getItems();
	}

	public ProductDetails getListDetails() {
		return listDetails;
	}

	public void setListDetails(ProductDetails listDetails) {
		this.listDetails = listDetails;
	}
}
