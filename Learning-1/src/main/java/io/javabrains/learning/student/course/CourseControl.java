package io.javabrains.learning.student.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseControl {
      
	  @Autowired
 	  CourseService cour;
		
	  @GetMapping(value="/courses")
      public List<Course> getCourses()
      {
    	  return cour.getCourses();  
      }
	  
	  @GetMapping(value="/courses/{id}")
	  public Optional<Course> getCourse(@PathVariable int id)
	  {
		  return cour.getcourse(id);
	  }
	  
	  @PostMapping(value="/courses")
	  public void addCourse(@RequestBody Course entry)
	  {
		  cour.addCourse(entry);
	  }
}
