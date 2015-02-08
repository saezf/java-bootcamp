package meetings.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "capacity")
	private int capacity;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "room")
	private List<Meeting> meetings = new ArrayList<Meeting>();

	public Room() {
	}

	public Room(String name) {
		this.name = name;
	}

	/**
	 * @param id2
	 */
	public Room(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public Long getID() {
		return this.id;
	}

	/**
	 * @param id2
	 */
	public void setID(Long id) {
		this.id=id;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room(Long id, String name, int capacity, String description) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.description = description;
	}
	
	
	
}
