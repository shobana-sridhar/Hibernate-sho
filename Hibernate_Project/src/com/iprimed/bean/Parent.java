package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parent")
public class Parent {
	
	@Id
	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="parent_name")
	private String parentName;
	
	public Parent() {}
	
	public Parent(int parentId,String parentName)
	{
		this.parentId=parentId;
		this.parentName=parentName;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	

}
