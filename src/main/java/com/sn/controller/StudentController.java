package com.sn.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sn.entity.Student;
import com.sn.service.StudentServices;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		
		return studentServices.getAllStudent();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		
		return studentServices.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id){
		
		studentServices.deleteStudentById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudentById(@RequestBody Student student){
		
		studentServices.updateStudentById(student);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student){
		
		studentServices.insertStudent(student);
	}

}
