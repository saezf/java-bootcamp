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

import com.bootcamp.spring.entities.Room;
import com.bootcamp.spring.service.RoomRepository;

@RestController
@RequestMapping(value="/api")
public class RoomController {
	
	@Autowired
	private RoomRepository roomRepository;

//	@RequestMapping("/hello")
//	public static String hello() {
//		return "Hello World!";
//	}
	
	@RequestMapping(value = "/room", method = RequestMethod.GET)
	public Iterable<Room> allRoom(){
		return roomRepository.findAll();
	}
	
	@RequestMapping(value = "/room/{id}", method = RequestMethod.GET)
	public Room findById(@PathVariable Long id){
		return roomRepository.findOne(id);
	}
	
	@RequestMapping(value = "/room/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody Room room){
		Room rx = roomRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No room with id: " + id);
		}
			room.setId(rx.getId());
			roomRepository.save(room);
	}
	
	@RequestMapping(value = "/room/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Room room, HttpServletRequest request, HttpServletResponse response){
		roomRepository.save(room);
		Long newId = room.getId();
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, newId);
		response.setHeader("Location",uri.toASCIIString());
	}
	
	@RequestMapping(value = "/room/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		roomRepository.delete(id);
	}
}