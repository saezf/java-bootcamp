package com.bootcamp.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.shoppingcart.entity.ShoppingCart;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	public ShoppingCart findById(Long id);
	public List<ShoppingCart> findAll(); 
	
}
