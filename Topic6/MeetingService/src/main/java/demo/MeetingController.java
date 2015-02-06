
package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * A class to test the interaction with MySQL database using the UserDao class.
 *
 * @author RoDoX
 */
@Controller
@RequestMapping( value = "/meeting" )
public class MeetingController {

  // ==============
  // PRIVATE FIELDS
  // ==============

  @Autowired
  private MeetingDao _meetingDao;
  private RoomDao _roomDao;
  
  // ==============
  // PUBLIC METHODS
  // ==============
  
  /**
   * Create a new meeting and save it in the database.
   * 
   * @param name user name
   *
   */
  @RequestMapping( method = RequestMethod.POST )
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void create(@RequestBody Meeting meeting) {
      _meetingDao.save(meeting);
   }

  
  /**
   * Delete the meeting having the passed id.
   * 
   * @param id the id of the meeting to delete
   * 
   */
  @RequestMapping( value = "{id}", method = RequestMethod.DELETE )
  @ResponseStatus( HttpStatus.OK )
  @ResponseBody
  public void delete(@PathVariable long id) {
   
	  Meeting meeting = new Meeting(id);
      _meetingDao.delete(meeting); 
  
  }
  
 
  
  /**
   * Update the meeting in the database having the
   * passed id.
   * 
   * @param id the id for the attendee to update.
   * @param time slot and description
   * *
   */
  @RequestMapping( value = "{id}", method = RequestMethod.PUT)
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void update(@PathVariable long id, @RequestBody Meeting meeting) {
    
	  Meeting meeting2 = _meetingDao.findOne(id);
      if(meeting2 == null){
    	  throw new IllegalStateException("No Room with id: " + id);
      }
      meeting.setId(meeting2.getId());
      _meetingDao.save(meeting);
      }
  
  
  @RequestMapping(value ="{id}",method = RequestMethod.GET)
  @ResponseBody
  public Meeting getAttendeeById(@PathVariable long id) {
	  Meeting meeting = _meetingDao.findById(id);
      return meeting;
  }
  
  @RequestMapping(value="/{id}/room/", method=RequestMethod.GET)
  public Room findRoom(@PathVariable Long Id) {
      Meeting meeting = _meetingDao.findById(Id);
      Room room = _roomDao.findById(meeting.getIdRoom());
      return room;
  }

  
  /**
   * return all the records of attedee´s table
   * 
   */
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public Iterable<Meeting> getMeetings() {
	  Iterable<Meeting> meeting = _meetingDao.findAll();
      return meeting;
  }

}