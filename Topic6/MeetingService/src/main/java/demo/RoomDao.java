/**
 * 
 */
package demo;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
/**
 * @author RoDoX
 *
 */
@Transactional
public interface RoomDao extends CrudRepository<Room, Long> {

	 /**
	   * Return the room having the passed name or null if no room is found.
	   * 
	   * @param name the room name.
	   */
	  public Room findByName(String name);
	  
	  public Room findById(Long id);
	  
	  public Iterable<Room> findAll();

	
	
}
