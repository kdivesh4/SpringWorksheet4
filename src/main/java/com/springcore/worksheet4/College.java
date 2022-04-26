package com.springcore.worksheet4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {
	
	@Autowired
	private List<Student> studentList;
	
	
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	public College(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "College [studentList=" + studentList + "]";
	}


	


	
}
