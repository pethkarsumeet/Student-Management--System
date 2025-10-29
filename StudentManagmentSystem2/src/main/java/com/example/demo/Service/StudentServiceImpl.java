package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;

	@Override
	public Student saveStudent(Student student) {
		
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		
		return repo.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		
		return repo.findById(id).get();
	}

//	@Override
//	public Student updateStudent(Student student) {
//	
//		return repo.save(student);
//	}

	
	@Override
	public void deleteStudentById(Integer id) {
	
	  repo.deleteById(id);
		
	}

	
	
}
