package com.bootcamp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.spring.entities.StudentXCourse;
import com.bootcamp.spring.service.StudentXCourseRepository;

@RestController
@RequestMapping(value="/api")
public class StudentXCourseController {
	
//	@Autowired
//	private StudentXCourseRepository studentXCourseRepository;
//	
//	@RequestMapping(value = "/student/{id}/courses", method = RequestMethod.GET)
//	public StudentXCourse findById(@PathVariable int id){
//		return studentXCourseRepository.findOne(id);
//	}
}