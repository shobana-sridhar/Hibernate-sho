package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue
	private int rollNo;
	
	@Column(name="student_name")
	private String studentName;
	
	private int age;
	
	//Constructors
	public Student() {}
	
	public Student(int rollNo,String studentName,int age)
	{
		this.rollNo=rollNo;
		this.studentName=studentName;
		this.age=age;
	}
	
	//Getters and Setters
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
