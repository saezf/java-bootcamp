package com.bootcamp.spring.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriTemplate;

import com.bootcamp.spring.entities.Atendee;
import com.bootcamp.spring.service.AttendeeRepository;

@RestController
@RequestMapping(value="/api")
public class AttendeeController {
	
	@Autowired
	private AttendeeRepository attendeeRepository;

//	@RequestMapping("/hello")
//	public static String hello() {
//		return "Hello World!";
//	}
	
	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public Iterable<Atendee> allAttendee(){
		return attendeeRepository.findAll();
	}
	
	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.GET)
	public Atendee findById(@PathVariable Long id){
		return attendeeRepository.findOne(id);
	}
	
	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody Atendee attendee){
		Atendee rx = attendeeRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No room with id: " + id);
		}
			attendee.setId(rx.getId());
			attendeeRepository.save(attendee);
	}
	
	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Atendee attendee, HttpServletRequest request, HttpServletResponse response){
		attendeeRepository.save(attendee);
		Long newId = attendee.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		attendeeRepository.delete(id);
	}
}
