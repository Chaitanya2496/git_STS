package io.javabrains.learning.student.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControl {
	 
	 @Autowired
	 StudentService obj;
	
     @GetMapping(value="/hello")	
	 public String hello()
	 {
		 return "Hi";
	 }
     
     @GetMapping(value="/students")
    public List<Student> getStudents()
 	{
 		return obj.getStudents();
 	}
    
     @GetMapping(value="/students/{rollNo}")
    public Student getStudent(@PathVariable int rollNo)
    {
    	return obj.getStudent(rollNo);
    }
    @PostMapping(value="/students")
    public void addStudent(@RequestBody Student newEntry)
    {
    	obj.addStudent(newEntry);
    }
    
    @DeleteMapping(value="students/{rollNo}")
    public void deleteStudent(@PathVariable int rollNo)
    {
    	obj.deleteStudent(rollNo);
    }
}
