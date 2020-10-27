package io.javabrains.learning.student.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int courseId;
	private String name;
	
	public Course()
	{
		
	}
	public Course(int courseId,String name)
	{
		this.courseId=courseId;
		this.name=name;
	}
	public void setId(int courseId)
	{
		this.courseId=courseId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return courseId;
	}
	public String getName()
	{
		return name;
	}

}
