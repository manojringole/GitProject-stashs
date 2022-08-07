package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student savestudent(Student student) {
		
		Student student1 = repository.save(student);
		return student1;
	}

	@Override
	public List<Student> getAll() {
		
		List<Student> all = repository.findAll();
		return all;
	}

	@Override
	public Student findByAge(int studentAge) {
		
		Student age = repository.findByStudentAge(studentAge);
		return age;
	}
}
