package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="new_student")
public class StudentCol {
	@Id
	@Column(name="roll_No")
	private int rollNo;
	
	@Column(name="student_name")
	private String name;
	
	@ManyToOne //Column to have reference to access college details
	@JoinColumn(name="college_id")
	private College college;

	

	public StudentCol() {}
	
	
	
	public StudentCol(int rollNo, String name, College college) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.college = college;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}
