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

import com.bootcamp.spring.entities.Meeting;
import com.bootcamp.spring.service.MeetingRepository;

@RestController
@RequestMapping(value="/api")
public class MeetingController {
	
	@Autowired
	private MeetingRepository meetingRepository;
	
	@RequestMapping(value = "/meeting", method = RequestMethod.GET)
	public Iterable<Meeting> allMeeting(){
		return meetingRepository.findAll();
	}
	
	@RequestMapping(value = "/meeting/{id}", method = RequestMethod.GET)
	public Meeting findById(@PathVariable Long id){
		return meetingRepository.findOne(id);
	}
	
	@RequestMapping(value = "/meeting/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	//public void create(@RequestBody Meeting meeting, HttpServletRequest request, HttpServletResponse response){
	public void create(@RequestBody Meeting meeting, HttpServletRequest request, HttpServletResponse response){
		meetingRepository.save(meeting);
		Long newId = meeting.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	@RequestMapping(value = "/meeting/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody Meeting meeting){
		Meeting rx = meetingRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No room with id: " + id);
		}
			meeting.setId(rx.getId());
			meetingRepository.save(meeting);
	}
	
	@RequestMapping(value = "/meeting/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		meetingRepository.delete(id);
	}
}
