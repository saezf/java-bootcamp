package com.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartServiceJmsClient implements ShoppingCartService{
    ShoppingCartService jmsObject;  
    
    public ShoppingCartServiceJmsClient() {  
        //jmsObject = code to get the reference to Service A from the jms call  
    }

	public ArrayList<String> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addItem(Product newProduct) {
		// TODO Auto-generated method stub
		
	}

	public void removeItem(Product productToRemove) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getListItems() {
		// TODO Auto-generated method stub
		return null;
	} 

}
