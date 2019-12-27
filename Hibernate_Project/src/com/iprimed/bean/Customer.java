package com.iprimed.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="customer")

public class Customer {
	
	//Properties to represent Customer
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private long mobile;
	
	//Getters and Setters method used to retrieve the values 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	//no argument constructor
	Customer(){}
	
	//parameterized constructor
	public Customer(String name,String email,long mobile)
	{
		this.name=name;
		this.email=email;
		this.mobile=mobile;
		
	}
	
	
	
	
	

}
