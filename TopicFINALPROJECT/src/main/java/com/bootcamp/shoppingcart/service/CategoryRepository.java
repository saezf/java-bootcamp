package com.bootcamp.shoppingcart.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.shoppingcart.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
