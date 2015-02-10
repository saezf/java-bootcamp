package meetings.services;

import java.util.List;

import meetings.entities.Attendee;
import meetings.entities.Meeting;
import meetings.entities.Room;
import meetings.entities.TimeSlot;

public interface MeetingsServiceInterface {

	public List<Attendee> getAttendees();

	public Attendee getAttendee(Long id);

	public List<Room> getRooms();

	public Room getRoom(Long id);
	
	public TimeSlot getTimeSlot(Long id);
	
	public List<TimeSlot> getTimeSlots(Long id); 

	public List<Meeting> getMeetings();

	public Meeting getMeeting(Long id);

	public void removeMeeting(Long id);

	public Meeting addMeetings(Long roomID, Long timeSlotId,List<Attendee> attendeeList, String description);

	public TimeSlot getTimeSlot(long timeSlotId);

	
	
}