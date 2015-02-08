package meetings.controllers;

import java.util.ArrayList;
import java.util.List;

import meetings.data.AttendeeRepository;
import meetings.entities.Attendee;
import meetings.entities.Meeting;
import meetings.entities.Room;
import meetings.services.MeetingsService;
import meetings.services.MeetingsServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RestController
@RequestMapping("/meetingservice")
public class MeetingController {
	
	private AttendeeRepository attendeeRepository;
	@Autowired
	private MeetingsServiceInterface meetingService = new MeetingsService();

	// attendees
	@RequestMapping(value = "attendees", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public List<Attendee> getAttendees() {
		return meetingService.getAttendees();
	}

	// attendees/{id}
	@RequestMapping(value = "attendees/{id}", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public Attendee getAttendee(@PathVariable Long id) {
		return meetingService.getAttendee(id);
	}

	// rooms
	@RequestMapping(value = "rooms", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public List<Room> getRooms() {
		return meetingService.getRooms();
	}

	// rooms/{id}
	@RequestMapping(value = "rooms/{id}", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public Room getRoom(@PathVariable Long id) {
		return meetingService.getRoom(id);
	}

	
	
	// add a new meeting with new attendees
	@RequestMapping(value = "meetings/{roomId}/{timeSlotId}", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus( HttpStatus.CREATED )
	public Meeting addMeeting(@PathVariable ("roomId") long roomId, @PathVariable ("timeSlotId") long timeSlotId, @RequestBody String attendees) {
		String description = "test";
		System.out.println(timeSlotId);
		System.out.println(roomId);
		Gson gson = new Gson();
		List<Attendee> attendeeList = gson.fromJson(attendees, new TypeToken<List<Attendee>>(){}.getType());
		return meetingService.addMeetings(roomId, timeSlotId, attendeeList, description);
	}

	
	// add a new meeting with new attendees
		@RequestMapping(value = "meetings/{roomId}/{timeSlotId}", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus( HttpStatus.CREATED )
		public Meeting addMeeting(@PathVariable ("roomId") long roomId, @PathVariable ("timeSlotId") long timeSlotId, @RequestBody List<Attendee> attendees) {
			String description = "test";
			List<Attendee> attendeeList = new ArrayList<Attendee>();
			for (Attendee a : attendees) {
				attendeeList.add(attendeeRepository.findById(a.getID()));
			}
			return meetingService.addMeetings(roomId, timeSlotId, attendeeList, description);
		}
	
	@SuppressWarnings("null")
	@RequestMapping(value = "meetings/{roomId}/{timeSlotId}/{attendeeId}", method = RequestMethod.POST)
	@ResponseStatus( HttpStatus.CREATED )
	public Meeting addMeeting(@PathVariable ("roomId") long roomId, @PathVariable ("timeSlotId") long timeSlotId,
			@PathVariable ("attendeeId") long attendeeId) {
		String description = "test";
		List<Attendee> attendee = null;
		attendee.add(meetingService.getAttendee(attendeeId));
		  
	    return meetingService.addMeetings(roomId, timeSlotId, attendee, description);
	}
	
	
	// meetings
	@RequestMapping(value = "meetings", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public List<Meeting> getMeetings() {
		return meetingService.getMeetings();
	}

	// meetings/{id}
	@RequestMapping(value = "meetings/{id}", method = RequestMethod.GET)
	@ResponseStatus( HttpStatus.OK )
	public Meeting getMeeting(@PathVariable Long id) {
		return meetingService.getMeeting(id);
	}

	// meetings/{id}
	@RequestMapping(value = "meetings/{id}", method = RequestMethod.DELETE)
	@ResponseStatus( HttpStatus.OK )
	public void removeMeeting(@PathVariable Long id) {
		meetingService.removeMeeting(id);
		}
	
	
}
