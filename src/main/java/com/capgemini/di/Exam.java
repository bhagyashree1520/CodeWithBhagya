package com.capgemini.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
//		Student stud = app.getBean("student",Student.class);
//		stud.display();
//		 
//		app.getBean("student2", Student.class).display();
		
		
		//constructor injection
		app.getBean("student3", Student.class).display();
	}

}
