/****
 * 
 */
package com.bootcamp.shoppingcart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 * @author RoDoX
 *
 */

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "shoppingCart")
	private Order order;
	
	@OneToMany(mappedBy = "shoppingCart")
	private List<ProductLine> productLine;
  
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")	
	private User user;
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public ShoppingCart() {
	}

	public ShoppingCart(long id){
		this.id = id;
	}
	
	
	public ShoppingCart(User user, List<ProductLine> productLine) {
		this.productLine = productLine;
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<ProductLine> getProductLine() {
		return productLine;
	}


	public void setProductLine(List<ProductLine> productLine) {
		this.productLine = productLine;
	}

	

		
	
}