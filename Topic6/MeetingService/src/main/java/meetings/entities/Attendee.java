package meetings.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "attendee")
public class Attendee {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "attendees")
	private List<Meeting> meetings = new ArrayList<Meeting>();

	@Column(name = "name")
	private String name;

	public Attendee() {
	}

	public Attendee(String name) {
		this.name = name;
	}

	public Long getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
