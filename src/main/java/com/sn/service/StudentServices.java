package com.sn.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dao.StudentDAO;
import com.sn.entity.Student;

@Service
public class StudentServices {

	@Autowired
	private StudentDAO studentDAO;
	
   public Collection<Student> getAllStudent(){
		
		return studentDAO.getAllStudent();
	}
   
   public Student getStudentById(int id){
	   
	   return studentDAO.getStudentById(id);
   }
   
   public void deleteStudentById(int id){
	   
	   studentDAO.deleteStudent(id);
   }
   
   public void updateStudentById(Student student){
	   studentDAO.updateStudentById(student);
   }

public void insertStudent(Student student) {
	studentDAO.insertStudent(student);
	
}
}
