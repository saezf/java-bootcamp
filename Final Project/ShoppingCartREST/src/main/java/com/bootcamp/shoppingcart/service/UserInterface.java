package com.bootcamp.shoppingcart.service;

import com.bootcamp.shoppingcart.entity.CreditCard;
import com.bootcamp.shoppingcart.entity.User;

public interface UserInterface {

	public void addUser(User user);

	public User findById(Long id);
	
	public void addCreditCard(CreditCard creditCard);
}