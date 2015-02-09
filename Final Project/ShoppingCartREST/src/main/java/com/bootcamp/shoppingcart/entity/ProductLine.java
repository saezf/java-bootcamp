/****
 * 
 */
package com.bootcamp.shoppingcart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * @author RoDoX
 *
 */

@Entity
@Table(name = "product_line")
public class ProductLine {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "subtotal")
	private double subTotal;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shoppingcart_id")
	private ShoppingCart shoppingCart;

	
	public ProductLine(Product product, int quantity, double subTotal,
			ShoppingCart shoppingCart) {
		this.product = product;
		this.quantity = quantity;
		this.subTotal = subTotal;
		this.shoppingCart = shoppingCart;
	}


	public ProductLine(Long id) {
		this.id = id;
	}


	public ProductLine() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
	
	
}