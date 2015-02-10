package meetings.data;

import java.util.List;

import meetings.entities.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	public Room findById(Long id);
	public List<Room> findAll(); 
}
