package com.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCartServiceWebServiceClient implements ShoppingCartService{
    ShoppingCartService imp = new ShoppingCartServiceImpl();  
//    public ShoppingCartServiceWebServiceClient() {  
//        //webService = code to get the reference to Service A from the webservice call  
//    }
    
	public List<Product> getListItems() {
		return imp.getListItems();
	}

	public String getItems() {
		return imp.getItems();
	}

	public void addItem(Product newProduct) {
		imp.addItem(newProduct);
		
	}

	public void removeItem(Product productToRemove) {
		imp.removeItem(productToRemove);
	} 
}
