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
public interface MeetingDao extends CrudRepository<Meeting, Long> {
 
	public Meeting findById(Long id);
	  
	public Iterable<Meeting> findAll();

}
