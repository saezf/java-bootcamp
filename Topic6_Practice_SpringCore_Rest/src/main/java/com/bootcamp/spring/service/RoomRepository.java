package com.bootcamp.spring.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.spring.entities.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
