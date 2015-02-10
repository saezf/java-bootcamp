package com.bootcamp.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.shoppingcart.entity.ProductLine;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, Long> {
	public ProductLine findById(Long id);
	public List<ProductLine> findAll(); 
}
