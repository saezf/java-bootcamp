package com.bootcamp.shoppingcart.service;

import java.util.List;

import com.bootcamp.shoppingcart.entity.Category;
import com.bootcamp.shoppingcart.entity.Product;
import com.bootcamp.shoppingcart.entity.ShoppingCart;
import com.bootcamp.shoppingcart.entity.User;

public interface ShoppingCartServiceInterface {

	public List<Product> getProducts();

	public Product getProduct(Long id);

	public void removeProduct(Long id);

	public Product addProduct(Long id);
	
	public User getUser(Long id);

	public Category getCategory(Long id);
	
	public ShoppingCart getShoppingCart(Long id);
}