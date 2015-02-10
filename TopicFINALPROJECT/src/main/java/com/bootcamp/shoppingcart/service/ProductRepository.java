package com.bootcamp.shoppingcart.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.shoppingcart.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
