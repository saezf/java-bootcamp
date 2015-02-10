package com.bootcamp.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="ROOM")
public class Room {
	@Id
	@GeneratedValue
	@Column(name="room_id")
	private Long Id;
	
	@Column(name="room_number", nullable = false, unique = true)
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
}
