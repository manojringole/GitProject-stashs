package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	public Student savestudent(Student student);
	
	public List<Student> getAll();
	
	public Student findByAge(int studentAge);
}
