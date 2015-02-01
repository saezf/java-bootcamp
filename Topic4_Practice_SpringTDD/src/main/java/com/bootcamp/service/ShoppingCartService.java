package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
	String getItems();
	void addItem(Product newProduct);
	void removeItem(Product productToRemove);
	List<Product> getListItems();
}
