package com.bootcamp.shoppingcart.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriTemplate;

import com.bootcamp.shoppingcart.entity.ShoppingCart;
import com.bootcamp.shoppingcart.service.ShoppingCartRepository;

@RestController
@RequestMapping(value = "/api/user/{usrid}/cart")
public class ShoppingCartController {
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	
	//Get Shopping Cart By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ShoppingCart findById(@PathVariable long id) {
		return shoppingCartRepository.findOne(id);
	}
	
	//Create a Shopping Cart
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody ShoppingCart shoppingCart, HttpServletRequest request, HttpServletResponse response){
		shoppingCartRepository.save(shoppingCart);
		Long newId = shoppingCart.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	//Modify a Shopping Cart
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody ShoppingCart shoppingCart){
		ShoppingCart rx = shoppingCartRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No Shopping Cart with id: " + id);
		}
			shoppingCart.setId(rx.getId());
			shoppingCartRepository.save(shoppingCart);
	}
	
	//Delete a Shopping Cart By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		shoppingCartRepository.delete(id);
	}
}
