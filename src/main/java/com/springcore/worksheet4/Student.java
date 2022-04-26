package com.springcore.worksheet4;

public class Student {
	
	private String name;
	private int age;
	private int shift;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, int shift, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.shift = shift;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", shift=" + shift + ", address=" + address + "]";
	}
	
	
	
}
