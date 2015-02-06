package demo;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
/**
 * @author RoDoX
 *
 */
@Transactional
public interface TimeSlotDao extends CrudRepository<TimeSlot, Long> {

	 /**
	   * Return the room having the passed name or null if no room is found.
	   * 
	   * @param name the room name.
	   */
	    
	  public TimeSlot findById(Long id);
	  
	  public Iterable<TimeSlot> findAll();
	
}
