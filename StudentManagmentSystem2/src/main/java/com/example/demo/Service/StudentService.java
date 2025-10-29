package com.example.demo.Service;

import java.util.List;

import org.hibernate.sql.ast.tree.update.UpdateStatement;

import com.example.demo.Entity.Student;

public interface StudentService {
     
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
	
//    public	Student updateStudent(Student student); 

	void deleteStudentById(Integer id);
	
	
}
