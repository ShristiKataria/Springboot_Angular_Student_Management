package com.student.service;

import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;

@Service
public interface StudentService {
	
	public StudentEntity registerStudent(StudentEntity student);

}
