package com.iprimed.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class College {
	@Id
	@Column(name="college_id")
	private int collegeId;
	@Column(name="college_name")
	private String collegeName;
	
	@OneToMany(targetEntity=StudentCol.class,mappedBy="college",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private StudentCol student;
	
	public College() {}
	
	
	public College(int collegeId, String collegeName, StudentCol student) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.student = student;
	}
	
	public int getCollegeId() {
		return collegeId;
	}
	
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public StudentCol getStudent() {
		return student;
	}

	public void setStudent(StudentCol student) {
		this.student = student;
	}
	

}
