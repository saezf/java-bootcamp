package meetings.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "time_slot")
public class TimeSlot {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Temporal(TemporalType.TIME)
	@Column(name = "begin_hour")
	private Date begin_hour;
	@Temporal(TemporalType.TIME)
	@Column(name = "end_hour")
	private Date end_hour;
	@Column(name = "date_timeslot")
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;

	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "timeSlot")
	private Meeting meeting;

	public TimeSlot() {
	}

	public TimeSlot(Date begin_hour, Date end_hour, Date date) {
		
		this.begin_hour = begin_hour;
		this.end_hour = end_hour;
		this.date = date;
	}

	public TimeSlot(TimeSlot timeslot) {
		this.id = timeslot.id;
		this.begin_hour = timeslot.begin_hour;
		this.end_hour = timeslot.end_hour;
		this.date = timeslot.date;
		
	}

	
	public TimeSlot(long id) {
		this.id = id;
	}

	public Date getBeginHour() {
		return begin_hour;
	}

	public Date getEndHour() {
		return end_hour;
	}

	
	public boolean sameDay(TimeSlot timeSlot) {
		if (date == timeSlot.date ) {
			return true;
		} else {
			return false;
		}
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Date getDate() {
		return date;
	}

	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id =id;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
