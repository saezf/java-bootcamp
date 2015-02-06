package com.bootcamp.spring.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.spring.entities.Meeting;

@Repository
public interface MeetingRepository extends CrudRepository<Meeting, Long>{

}
