package io.javabrains.learning.student.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.javabrains.learning.student.course.Course;

@Entity
public class Student {
	
	@Id
	private int rollNo;
	
	
	private String name;
	
	
	private int standard;
	
	private Course course;
	
	public Student()
	{
		
	}
	public Student(int rollNo,String name,int standard)
	{
	     this.rollNo=rollNo;
	     this.name=name;
	     this.standard=standard;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public String getname()
	{
		return name;
	}
	public int getstandard()
	{
		return standard;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStandard(int standard)
	{
		this.standard=standard;
	}
	
	
	

}
