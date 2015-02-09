package com.bootcamp.spring.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MEETING")
public class Meeting {
	
	@Id
	@GeneratedValue
	@Column(name="meeting_id")
	private Long Id;
	
	@Column(name="topic", nullable = false, length = 50)
	private String topic;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
//	@Column(name="room_id", nullable = false)
	private Room room;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
    private Set<Atendee> attendee;
	
	@Temporal(TemporalType.TIME)
	@Column(name="time_from")
	private Date from;
	
	@Temporal(TemporalType.TIME)
	@Column(name="time_to")
	private Date to;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Long getId() {
		return Id;
	}
	
	public void setId(Long id) {
		Id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public Set<Atendee> getAttendee() {
		return attendee;
	}

	public void setAttendee(Set<Atendee> attendee) {
		this.attendee = attendee;
	}
}
