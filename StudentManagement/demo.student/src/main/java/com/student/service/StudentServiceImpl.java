package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentEntity registerStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		
		StudentEntity s=this.studentRepository.save(student);
		return s;
	}

}
