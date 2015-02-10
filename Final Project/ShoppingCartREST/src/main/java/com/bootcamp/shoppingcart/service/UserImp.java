package com.bootcamp.shoppingcart.service;

import org.springframework.stereotype.Service;

import com.bootcamp.shoppingcart.entity.CreditCard;
import com.bootcamp.shoppingcart.entity.User;


@Service
public class UserImp implements UserInterface {

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.UserInterface#addUser(com.bootcamp.shoppingcart.entity.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.UserInterface#findById(java.lang.Long)
	 */
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.UserInterface#addCreditCard(com.bootcamp.shoppingcart.entity.CreditCard)
	 */
	@Override
	public void addCreditCard(CreditCard creditCard) {
		// TODO Auto-generated method stub
		
	}

	
}