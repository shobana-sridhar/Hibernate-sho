package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	@Id
	@Column(name="college_id")
	private int collegeId;
	
	@Column(name="college_name")
	private String collegeName;
	
	@OneToMany(targetEntity=StudentCol.class,mappedBy="college",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<StudentCol> student =new ArrayList<StudentCol>();

	public College() {}
	
	public College(int collegeId, String collegeName, List<StudentCol> student) {
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

	public List<StudentCol> getStudent() {
		return student;
	}

	public void setStudent(List<StudentCol> student) {
		this.student = student;
	}
	
	
	

}
