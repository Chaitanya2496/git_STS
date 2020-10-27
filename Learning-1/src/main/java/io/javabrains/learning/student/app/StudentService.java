package io.javabrains.learning.student.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class StudentService {
    
	@Autowired
	private StudentRepository studRepo;
	
//	private List<Student> stud=new ArrayList<>( Arrays.asList(
//			new Student(1,"Aakash",6),
//			new Student(2,"Aman",6),
//			new Student(3,"Bharat",6)
//			));
	
	
	public List<Student> getStudents()
	{
		List<Student> stud=new ArrayList<>();
		studRepo.findAll().forEach(stud::add);
		return stud;
	}
	public Student getStudent(int rollNo)
	{
		 return studRepo.findById(rollNo);
	}
	
	public void addStudent(Student newEntry)
	{
		studRepo.save(newEntry);
	}
	
	public void deleteStudent(int rollNo)
	{
		studRepo.deleteById(rollNo);
	}
        
}
