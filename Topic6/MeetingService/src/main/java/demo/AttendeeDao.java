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
public interface AttendeeDao extends CrudRepository<Attendee, Long> {

	 /**
	   * Return the attendee having the passed name or null if no room is found.
	   * 
	   * @param name the attendee name.
	   */
	  public Attendee findByName(String name);
	  
	  public Attendee findById(Long id);
	  
	  public Iterable<Attendee> findAll();
	
}