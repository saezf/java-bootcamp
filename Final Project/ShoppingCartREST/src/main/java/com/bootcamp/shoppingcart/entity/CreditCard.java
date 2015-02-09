/**
 * 
 */
package com.bootcamp.shoppingcart.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * @author RoDoX
 *
 */
@Entity
@Table(name="creditcard")
public class CreditCard {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "brand")
	@NotNull
	private String brand;
	
	@Column(name = "number")
	@NotNull
	private double number;
	
	@Column(name = "bank")
	@NotNull
	private String bank;
	
	@Column(name = "ownername")
	@NotNull
	private String ownername;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date expdate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public CreditCard() {

	}

	public CreditCard(Long id) {
		this.id = id;
	}

	public CreditCard(String brand, double number, String bank,
			String ownername, Date expdate, User user) {
		this.brand = brand;
		this.number = number;
		this.bank = bank;
		this.ownername = ownername;
		this.expdate = expdate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public Date getExpdate() {
		return expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
