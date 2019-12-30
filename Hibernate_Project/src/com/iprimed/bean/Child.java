package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class Child {
	@Id
	@Column(name="child_id")
	private int childId;
	
	@Column(name="child_name")
	private String childName;
	
	public Child() {}
	
	public Child(int childId,String childName)
	{
		this.childId=childId;
		this.childName=childName;
	}
	
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	
	

}
