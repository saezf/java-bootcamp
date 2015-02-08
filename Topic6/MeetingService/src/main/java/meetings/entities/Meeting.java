package meetings.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meeting")
public class Meeting {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
/*	@Column(name="id_room")
	private long id_room;
	
	@Column(name="id_time_slot")
	private long id_timeSlot; */

	@Column(name="description")
	private String description;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "attendees_meeting", joinColumns = { @JoinColumn(name = "meeting_id") }, inverseJoinColumns = { @JoinColumn(name = "attendee_id") })
	private List<Attendee> attendees;

	@OneToOne(cascade = CascadeType.ALL)
	private TimeSlot timeSlot;

	@ManyToOne(cascade = CascadeType.ALL)
	private Room room;

	public Meeting() {
	}


	public Meeting(TimeSlot timeSlot, Room room, List<Attendee> attendees,
			String description) {
		this.timeSlot = timeSlot;
		this.room = room;
		this.attendees = attendees;
		this.description = description;
	}

	public List<Attendee> getAttendees() {
		return this.attendees;
	}

	public TimeSlot getTimeSlot() {
		return this.timeSlot;
	}

	public Room getRoom() {
		return this.room;
	}

	public Long getId() {
		return this.id;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
