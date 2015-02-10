/**
 * 
 */
package com.bootcamp.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.shoppingcart.entity.Product;
import com.bootcamp.shoppingcart.entity.ProductLine;
import com.bootcamp.shoppingcart.entity.ShoppingCart;
import com.bootcamp.shoppingcart.repository.ProductLineRepository;
import com.bootcamp.shoppingcart.repository.ProductRepository;
import com.bootcamp.shoppingcart.repository.ShoppingCartRepository;

/**
 * 
 *
 * @author RoDoX
 */
@RestController
@RequestMapping( value = "api/user" )
public class ShoppingCartController {

  
	 @Autowired
	 private ShoppingCartRepository shoppingCartRepository;
	 private ProductLineRepository productLineRepository;
	 private ProductRepository productRepository;
  
	 //create a ShoppingCart
	 @RequestMapping(value ="{id}/cart", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE  )
	  @ResponseStatus( HttpStatus.CREATED )
	   public void create(@RequestBody ShoppingCart shoppingCart) {
		  shoppingCartRepository.save(shoppingCart);
	     }
	 
	 
	 //get a shoppingcart with the passed id
	   @RequestMapping(value ="{id}/cart/{scid}",method = RequestMethod.GET)
	   public ShoppingCart getShoppingCartById(@PathVariable long scid) {
		  ShoppingCart shoppingCart = shoppingCartRepository.findById(scid);
	      return shoppingCart;
	  }
	 
	 
	 //get a shoppingcart with the passed id
	   @RequestMapping(value ="{id}/cart/{scId}{pId}{quantity}",method = RequestMethod.POST)
	   @ResponseStatus( HttpStatus.CREATED )
	   public void addProductLineToShoppingCart(@PathVariable long id, @PathVariable int scId,
			   @PathVariable long pId,@PathVariable int quantity) {
		   Product product = productRepository.findById(pId);
		   System.out.println(product);
		   ProductLine productLine = new ProductLine();
		   productLine.setProduct(product);
		   productLine.setQuantity(quantity);
		   productLine.setShoppingcart_id(scId);
		   productLine.setSubTotal(quantity* productLine.getProduct().getPrice());
		   productLineRepository.save(productLine);
		   
	  }
	 
	 
	  

}