
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
@RequestMapping( value = "/attendee" )
public class AttendeeController {

  // ==============
  // PRIVATE FIELDS
  // ==============

  @Autowired
  private AttendeeDao _attendeeDao;
  
  // ==============
  // PUBLIC METHODS
  // ==============
  
  /**
   * Create a new attendee and save it in the database.
   * 
   * @param name user name
   *
   */
  @RequestMapping( method = RequestMethod.POST )
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void create(@RequestBody Attendee attendee) {
      _attendeeDao.save(attendee);
   }

  
  /**
   * Delete the attendee having the passed id.
   * 
   * @param id the id of the room to delete
   * @return a string describing if the room is succesfully deleted or not.
   */
  @RequestMapping( value = "{id}", method = RequestMethod.DELETE )
  @ResponseStatus( HttpStatus.OK )
  @ResponseBody
  public void delete(@PathVariable long id) {
   
      Attendee attendee = new Attendee(id);
      _attendeeDao.delete(attendee); 
  
  }
  
 
  
  /**
   * Update the name and the for the attendee in the database having the
   * passed id.
   * 
   * @param id the id for the attendee to update.
   * @param name the new name.
   * * @return a string describing if the attendee is succesfully updated or not.
   */
  @RequestMapping( value = "{id}", method = RequestMethod.PUT)
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void update(@PathVariable long id, @RequestBody Attendee attendee) {
    
      Attendee attendee2 = _attendeeDao.findOne(id);
      if(attendee2 == null){
    	  throw new IllegalStateException("No Room with id: " + id);
      }
      attendee.setId(attendee2.getId());
      
          _attendeeDao.save(attendee);
      }
  
  
  @RequestMapping(value ="{id}",method = RequestMethod.GET)
  @ResponseBody
  public Attendee getAttendeeById(@PathVariable long id) {
	  Attendee attendee = _attendeeDao.findById(id);
      return attendee;
  }

  /**
   * return all the records of attedee´s table
   * 
   */
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public Iterable<Attendee> getAttendees() {
	  Iterable<Attendee> attendee = _attendeeDao.findAll();
      return attendee;
  }

}