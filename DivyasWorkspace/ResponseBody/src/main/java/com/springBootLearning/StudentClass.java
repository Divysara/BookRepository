package com.springBootLearning;



public class StudentClass {

	private String name;
	private int rollno;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "StudentClass [name=" + name + ", rollno=" + rollno + ", dept=" + dept + "]";
	}
	
	
}
