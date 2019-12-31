package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class College {
	@Id
	@Column(name="college_id")
	private int collegeId;
	@Column(name="college_name")
	private String collegeName;
	
	public College() {}
	
	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
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
	

}
