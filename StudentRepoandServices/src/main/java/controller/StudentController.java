package controller;

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

import model.Student;
import service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
		@Autowired
		StudentService studentService;
		
		@GetMapping("/student")
		private List<Student>getAllStudent()
		{
			return studentService.getAllStudent();
		}
		
		@GetMapping("/student/{id}")
		private Student getStudent(@PathVariable("id")int id)
		{
			return studentService.getStudentById(id);
		}
		
		@DeleteMapping("/student/{id}")
		private void deleteStudent(@PathVariable("id")int id)
		{
			studentService.delete(id);
		}
		
		@PostMapping("/student")
		private int saveStudent(@RequestBody Student student)
		{
			studentService.SaveOrUpdate(student);
			return student.getId();
		}
		
		@PutMapping("/student")
		private Student update(@RequestBody Student student)
		{
			studentService.SaveOrUpdate(student);
			return student;
		}
}
