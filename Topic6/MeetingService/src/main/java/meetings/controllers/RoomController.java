/**
 * 
 */
package meetings.controllers;

import meetings.data.RoomRepository;
import meetings.entities.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * A class to test the interaction with MySQL database using the UserDao class.
 *
 * @author RoDoX
 */
@RestController
@RequestMapping( value = "/room" )
public class RoomController {

  // ==============
  // PRIVATE FIELDS
  // ==============

  @Autowired
  private RoomRepository _roomDao;
  
  // ==============
  // PUBLIC METHODS
  // ==============
  
  /**
   * Create a new user and save it in the database.
   * 
   * @param name user name
   * @param description use description
   * @return a string describing if the room is succesfully created or not.
   */
  @RequestMapping( method = RequestMethod.POST )
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void create(@RequestBody Room room) {
        _roomDao.save(room);
     }
  
  /**
   * Delete the user having the passed id.
   * 
   * @param id the id of the room to delete
   */
  @RequestMapping( value = "{id}", method = RequestMethod.DELETE )
  @ResponseStatus( HttpStatus.OK )
  @ResponseBody
  public void delete(@PathVariable long id) {
   
      Room room = new Room(id);
      _roomDao.delete(room); 
  
  }
  
 
  /**2
   * Update the name and the description for the room in the database having the
   * passed id.
   * 
   * @param id the id for the room to update.
   * @param name the new name.
   * @param description the new description.
   * @param capacity the new capacity.
   */
 
  
  @RequestMapping( value = "{id}", method = RequestMethod.PUT)
  @ResponseStatus( HttpStatus.CREATED )
  @ResponseBody
  public void update(@PathVariable long id, @RequestBody Room room) {
    
      Room room2 = _roomDao.findOne(id);
      if(room2 == null){
    	  throw new IllegalStateException("No Room with id: " + id);
      }
      room.setID(room2.getID());
      
          _roomDao.save(room);
      }
  
  @RequestMapping(value ="{id}",method = RequestMethod.GET)
  @ResponseBody
  public Room getRoomsById(@PathVariable long id) {
	  Room room = _roomDao.findById(id);
      return room;
  }

  
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public Iterable<Room> getRooms() {
	  Iterable<Room> room = _roomDao.findAll();
      return room;
  }

}