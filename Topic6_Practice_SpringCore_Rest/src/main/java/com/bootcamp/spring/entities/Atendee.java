package com.bootcamp.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="ATTENDEE")
public class Atendee {
	@Id
	@GeneratedValue
	@Column(name="attendee_id")
	private Long Id;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
