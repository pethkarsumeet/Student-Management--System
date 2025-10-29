package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService {

	@Autowired
	StudentRepository repo;
	
	
	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
	
		return repo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
	
		repo.deleteById(id);
		
	}
	
	

}
