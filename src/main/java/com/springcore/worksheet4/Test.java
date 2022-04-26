package com.springcore.worksheet4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/worksheet4/config.xml");
		College college = (College)context.getBean("college");
		System.out.println(college);
		//Student student = (Student) context.getBean("student");
		//System.out.println(student);
		//Address address = (Address)context.getBean("add");
		//System.out.println(address);
	}
}
