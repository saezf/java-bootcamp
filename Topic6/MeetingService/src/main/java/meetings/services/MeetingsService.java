package meetings.services;

import java.util.List;

import meetings.data.AttendeeRepository;
import meetings.data.MeetingRepository;
import meetings.data.RoomRepository;
import meetings.data.TimeSlotRepository;
import meetings.entities.Attendee;
import meetings.entities.Meeting;
import meetings.entities.Room;
import meetings.entities.TimeSlot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingsService implements MeetingsServiceInterface {

	private RoomRepository roomRepository;
	private AttendeeRepository attendeeRepository;
	private MeetingRepository meetingRepository;
	private TimeSlotRepository  timeSlotRepository;

	public MeetingsService() {
	}

	@Autowired
	public MeetingsService(RoomRepository roomRepository, AttendeeRepository attendeeRepository, MeetingRepository meetingRepository, TimeSlotRepository timeSlotRepository) {
		this.roomRepository = roomRepository;
		this.attendeeRepository = attendeeRepository;
		this.meetingRepository = meetingRepository;
		this.timeSlotRepository = timeSlotRepository;
	}

	@Override
	public List<Attendee> getAttendees() {
		return attendeeRepository.findAll();
	}

	@Override
	public Attendee getAttendee(Long id) {
		return attendeeRepository.findById(id);
	}

	@Override
	public List<Room> getRooms() {
		return roomRepository.findAll();
	}

	@Override
	public Room getRoom(Long id) {
		return roomRepository.findById(id);
	}

	@Override
	public List<Meeting> getMeetings() {
		return meetingRepository.findAll();
	}

	@Override
	public Meeting getMeeting(Long id) {
		return meetingRepository.findById(id);
	}

	@Override
	public TimeSlot getTimeSlot(Long id){
		return  timeSlotRepository.findById(id);
		
	}
	
	@Override
	public List<TimeSlot> getTimeSlots(Long id){
		return timeSlotRepository.findAll();
	}

	@Override
	public Meeting addMeetings(Long roomId, Long timeSlotId, List<Attendee> attendees, String description) {
		Meeting meeting = new Meeting();
		Room room = this.getRoom(roomId);
		TimeSlot timeSlot = this.getTimeSlot(timeSlotId);
		meeting.setAttendees(attendees);
		meeting.setDescription(description);
		meeting.setRoom(room);
		
		meeting.setTimeSlot(timeSlot);
	    return meetingRepository.save(meeting);	
	}
	
		
	
	
	@Override
	public void removeMeeting(Long id) {
		Meeting m = meetingRepository.findById(id);
		if (m == null) {
			throw new MeetingNotFoundException();
		} else {
			meetingRepository.delete(m);
		}
	}

	@SuppressWarnings("unused")
	private Room findRoom(Long id) {
		Room room = roomRepository.findById(id);
		if (room == null) {
			throw new RoomNotFoundException();
		}

		return room;
	}

	@SuppressWarnings("serial")
	class RoomNotFoundException extends RuntimeException {
		public RoomNotFoundException() {
			super("Room not found!");
		}
	}

	@SuppressWarnings("serial")
	class MeetingNotFoundException extends RuntimeException {
		public MeetingNotFoundException() {
			super("Meeting not found!");
		}
	}

	/* (non-Javadoc)
	 * @see meetings.services.MeetingsServiceInterface#getTimeSlot(long)
	 */
	@Override
	public TimeSlot getTimeSlot(long timeSlotId) {
		TimeSlot timeSlot = timeSlotRepository.findById(timeSlotId);
		return timeSlot;
	}

	
}
