package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StudentApi {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/registerStudent")
	public StudentEntity registerStudent(@RequestBody StudentEntity student){
		
		return this.studentService.registerStudent(student);
	
	}

}
