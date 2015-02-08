package meetings.data;

import java.util.List;

import meetings.entities.TimeSlot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {
	public TimeSlot findById(Long id);
	public List<TimeSlot> findAll(); 
}
