package com.sn.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sn.entity.Student;

@Repository
public class StudentDAO {
	
	private static Map<Integer, Student> students;
	
	static{
		
		students = new HashMap<Integer, Student>(){
			{
			put(1, new Student(1, "Manoj", "Computer Sceience"));
			put(2, new Student(2, "Rahul", "Computer Sceience"));
			put(3, new Student(3, "Rani", "Computer Sceience"));
			}
		};
		
	}
	
	public Collection<Student> getAllStudent(){
		
		return this.students.values();
	}
	
	public Student getStudentById(int id){
		
		return this.students.get(id);
	}
	
	public void deleteStudent(int id){
		
		this.students.remove(id);
	}
	
	public void updateStudentById(Student student){
		
		Student s = students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		
		this.students.put(student.getId(), student);
		
	}
	
	public void insertStudent(Student student){
		this.students.put(student.getId(), student);
	}
	
	

}
