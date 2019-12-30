package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrandChild  {

	
	@Column(name="grandchild_id")
	private int grandChildId;
	
	@Column(name="grandchild_name")
	private String grandChildName;
	
	
	public GrandChild() {}
	
	public GrandChild(int grandChildId,String grandChildName)
	{
		this.grandChildId=grandChildId;
		this.grandChildName=grandChildName;
	}
	public int getGrandChildId() {
		return grandChildId;
	}
	public void setGrandChildId(int grandChildId) {
		this.grandChildId = grandChildId;
	}
	public String getGrandChildName() {
		return grandChildName;
	}
	public void setGrandChildName(String grandChildName) {
		this.grandChildName = grandChildName;
	}
	
	
}
