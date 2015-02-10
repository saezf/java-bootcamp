package com.bootcamp.shoppingcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	@NotNull
	private String name;
	@Column(name = "description")
	@NotNull
	private String description;
	
	public Category() {
	}
	
	public Category(long id) {
		this.id = id;
	}

	public Category(String name, String description) {
		this.name = name;
		this.description = description;	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}		
}
