package com.bootcamp.service;

import java.util.ArrayList;

public class ShoppingCartServiceProxy implements ShoppingCartService{
	ShoppingCartService implementation;
	
    protected ShoppingCartServiceProxy(ShoppingCartService imp) {  
        this.implementation = imp;  
    }

	public ArrayList<String> getAllItems() {
		return implementation.getAllItems(); 
	}  

}
