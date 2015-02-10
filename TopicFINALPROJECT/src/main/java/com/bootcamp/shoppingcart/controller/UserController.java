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

import com.bootcamp.shoppingcart.entity.User;
import com.bootcamp.shoppingcart.service.CreditCardRepository;
import com.bootcamp.shoppingcart.service.UserRepository;

@RestController
@RequestMapping(value = "/api/user")
//@NamedQuery(name = "User.findCreditCard", query = "select u.creditCard from from User u where u.id = cc.  ")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CreditCardRepository creditcCardRepository;
	
	//Get User By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable long id) {
		return userRepository.findOne(id);
	}
	
	//Create a User
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
		userRepository.save(user);
		Long newId = user.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	//Modify a User
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody User user){
		User rx = userRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No user with id: " + id);
		}
			user.setId(rx.getId());
			userRepository.save(user);
	}
	
	//Delete a User By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		userRepository.delete(id);
	}
}
