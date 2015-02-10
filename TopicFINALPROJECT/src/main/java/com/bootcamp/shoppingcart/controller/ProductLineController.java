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

import com.bootcamp.shoppingcart.entity.ProductLine;
import com.bootcamp.shoppingcart.service.ProductLineRepository;

@RestController
@RequestMapping(value = "/api/user/{usrid}/cart/{cartid}")
public class ProductLineController {
	@Autowired
	private ProductLineRepository productLineRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<ProductLine> allProductLine(){
		return productLineRepository.findAll();
	}
	
	//Get ProductLine By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProductLine findById(@PathVariable long id) {
		return productLineRepository.findOne(id);
	}
	
	//Create a ProductLine
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody ProductLine productLine, HttpServletRequest request, HttpServletResponse response){
		productLineRepository.save(productLine);
		Long newId = productLine.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	//Modify a ProductLine
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody ProductLine productLine){
		ProductLine rx = productLineRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No product line with id: " + id);
		}
			productLine.setId(rx.getId());
			productLineRepository.save(productLine);
	}
	
	//Delete a ProductLine By Id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		productLineRepository.delete(id);
	}
}
