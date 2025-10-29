package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/stud")
public class StudentController {

	@Autowired
	StudentService serv;
	
	//Create data
	@PostMapping("/add")
	public String addstudent(@RequestBody Student student)
	{
		serv.saveStudent(student);
		
		return "New student is added";
	}
	
	//Getall data
	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		
		return serv.getAllStudents();
	}
	
	//getbyid data
	@GetMapping("/getby/{id}")
    public Student getbyid(@PathVariable("id") int id)
    {
           return serv.getStudentById(id);
    }
	
	//Update Dayta  but it is not soll / still error
//	@PostMapping("/pqr/{id}")
//    public void update(@PathVariable Integer id)
//    {
//          serv.getStudentById(id);
//    }

	
	//deleteById data
	@GetMapping("/del/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		serv.deleteStudentById(id);
		return "Delated student Syccessfully";
	
	}
	
}
