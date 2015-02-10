/**
 * 
 */
package com.bootcamp.shoppingcart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * @author RoDoX
 *
 */
@Entity
//@NamedQuery(name = "CreditCard.findByUserId", query = "SELECT p FROM CreditCard p WHERE p.user_id = ?1")
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
	
	@Column(name = "user_id")
	@NotNull
	private int user_id;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date expdate;
	
	public CreditCard() {

	}

	public CreditCard(Long id) {
		this.id = id;
	}

	public CreditCard(String brand, double number, String bank,
			String ownername, Date expdate, int user_id) {
		this.brand = brand;
		this.number = number;
		this.bank = bank;
		this.ownername = ownername;
		this.expdate = expdate;
		this.user_id = user_id;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
}
