package com.bootcamp.spring.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.spring.entities.Atendee;

@Repository
public interface AttendeeRepository extends CrudRepository<Atendee, Long>{

}
