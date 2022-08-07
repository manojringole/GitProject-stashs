package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private ServiceI serviceI;

	@PostMapping(value = "/save", produces = "application/json",consumes = "application/json")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		
		Student student1 = serviceI.savestudent(student);
		System.out.println(student1);
		
		return new ResponseEntity<>("saved:" +student1.getStudentId(),HttpStatus.OK);
		
	}
	@GetMapping(value = "all",produces = "application/json")
	public ResponseEntity<List<Student>> getAll(){
		
		List<Student> all = serviceI.getAll();
		return new ResponseEntity<List<Student>>(all,HttpStatus.OK);
		
	}
	@GetMapping(value = "/age/{studentAge}" ,produces = "application/json")
	public ResponseEntity<Student> findAge(@PathVariable int studentAge){
	
		Student age = serviceI.findByAge(studentAge);
		return new ResponseEntity<Student>(age,HttpStatus.OK);
		
	}

}
