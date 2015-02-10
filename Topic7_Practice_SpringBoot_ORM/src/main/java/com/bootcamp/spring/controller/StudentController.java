package com.bootcamp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.spring.entities.Course;
import com.bootcamp.spring.entities.Student;
import com.bootcamp.spring.service.StudentRepository;

@RestController
@RequestMapping(value="/api")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping("/hello")
	public static String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public Iterable<Student> allStudent(){
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student findById(@PathVariable int id){
		return studentRepository.findOne(id);
	}
	
	
	@RequestMapping(value = "/student/{id}/courses", method = RequestMethod.GET)
	public List<Course> findCoursesByStudent(@PathVariable int id){
		return studentRepository.findCoursesByStudent(id);
	}
	
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody Student student){
		Student rx = studentRepository.findOne(id);
		if(rx == null){
			throw new IllegalStateException("No room with id: " + id);
		}
			student.setIdStudent(rx.getIdStudent());
			studentRepository.save(student);
	}
//	
//	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void create(@RequestBody Atendee attendee, HttpServletRequest request, HttpServletResponse response){
//		attendeeRepository.save(attendee);
//		Long newId = attendee.getId();
//		String requestUrl = request.getRequestURL().toString();
//		URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, newId);
//		response.setHeader("Location",uri.toASCIIString());
//	}
//	
//	@RequestMapping(value = "/attendee/{id}", method = RequestMethod.DELETE)
//	@ResponseStatus(HttpStatus.OK)
//	public void delete(@PathVariable Long id){
//		attendeeRepository.delete(id);
//	}
}
