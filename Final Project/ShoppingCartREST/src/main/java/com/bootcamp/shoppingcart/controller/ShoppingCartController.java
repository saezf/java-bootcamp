/**
 * 
 */
package com.bootcamp.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.shoppingcart.entity.Category;
import com.bootcamp.shoppingcart.entity.Product;
import com.bootcamp.shoppingcart.service.ShoppingCartServiceImp;

/**
 * A class to test the interaction with MySQL database using the UserDao class.
 *
 * @author RoDoX
 */
@RestController
@RequestMapping( value = "/shoppingservice" )
public class ShoppingCartController {

  
	@Autowired
	private ShoppingCartServiceImp shoppingCart = new ShoppingCartServiceImp();
  
  
  
  
  
	@RequestMapping(value ="category/{id}",method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public Category getCategoryById(@PathVariable long id) {
		Category category = shoppingCart.getCategory(id);
		return category;
	}

	@RequestMapping(value ="product/{id}",method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public Product getProductById(@PathVariable long id) {
		Product product = shoppingCart.getProduct(id);
		return product;
	}
  

}