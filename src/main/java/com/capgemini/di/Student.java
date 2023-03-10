package com.capgemini.di;

public class Student {
	
	private String studentName;
	private Integer id;
	
	
	//constructor injection
	public Student(String studentName, Integer id) {
		this.studentName = studentName;
		this.id = id;
	}
	
	
	// setter injection. property name in beans.xml search for setter method.
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	
	public void display()
	{
		System.out.println("Student ID:"+id+" Student Name:"+studentName);
	}

}
