/**
 * 
 */
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
@RequestMapping( value = "/timeslot" )
public class TimeSlotController {

  // ==============
  // PRIVATE FIELDS
  // ==============

  @Autowired
  private TimeSlotDao _timeSlotDao;
  
  // ==============
  // PUBLIC METHODS
  // ==============
  
  /**
   * Create a new time slot and save it in the database.
   * 
   * @param start, time slot start hour
   * @param end, time slot end hour
   * @return a string describing if the time slot is succesfully created or not.
   */
  @RequestMapping( method = RequestMethod.POST )
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void create(@RequestBody TimeSlot timeslot) {
        _timeSlotDao.save(timeslot);
     }
  
  
  /**
   * Delete the time slot having the passed id.
   * 
   * @param id the id of the time slot to delete
   * @return a string describing if the time slot is succesfully deleted or not.
   */
  @RequestMapping( value = "{id}", method = RequestMethod.DELETE )
  @ResponseStatus( HttpStatus.OK )
  @ResponseBody
  public void delete(@PathVariable long id) {
   
      TimeSlot timeslot = new TimeSlot(id);
      _timeSlotDao.delete(timeslot); 
  
  }
  
    
  /**
   * Update the name and the description for the timeslot in the database having the
   * passed id.
   * The data to update is passed in Json format
   *  
   */
  @RequestMapping( value = "{id}", method = RequestMethod.PUT)
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void update(@PathVariable long id, @RequestBody TimeSlot timeslot) {
    
      TimeSlot timeslot2 = _timeSlotDao.findOne(id);
      if(timeslot2 == null){
    	  throw new IllegalStateException("No Room with id: " + id);
      }
      timeslot.setId(timeslot2.getId());
      
          _timeSlotDao.save(timeslot);
      }
  
  @RequestMapping(value ="{id}",method = RequestMethod.GET)
  @ResponseBody
  public TimeSlot getRoomsById(@PathVariable long id) {
	  TimeSlot timeslot = _timeSlotDao.findById(id);
      return timeslot;
  }

  
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public Iterable<TimeSlot> getRooms() {
	  Iterable<TimeSlot> timeslot = _timeSlotDao.findAll();
      return timeslot;
  }


}