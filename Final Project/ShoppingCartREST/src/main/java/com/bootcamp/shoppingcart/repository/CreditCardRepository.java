/**
 * 
 */
package com.bootcamp.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bootcamp.shoppingcart.entity.CreditCard;

/**
 * @author RoDoX
 *
 */
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
	public CreditCard findById(Long id);
	public List<CreditCard> findAll(); 
	
	@Query("SELECT p FROM CreditCard p WHERE (p.user_id) = (:user_id)")
	public List<CreditCard> find(@Param("user_id") long idusr);
	//public List<CreditCard> findByUserId(Long id);
}
