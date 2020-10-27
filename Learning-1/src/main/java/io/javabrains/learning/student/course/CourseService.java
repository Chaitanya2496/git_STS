package io.javabrains.learning.student.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
            
    @Autowired
    CourseRepository cou;
	
	public List<Course> getCourses()
	{
		List<Course> cour=new ArrayList<>();
		cou.findAll().forEach(cour::add);
		return cour;
	}
	
	public Optional<Course> getcourse(int courseId)
	{
		return cou.findById(courseId);
	}
	
	public void addCourse(Course entry)
	{
		cou.save(entry);
	}
}
