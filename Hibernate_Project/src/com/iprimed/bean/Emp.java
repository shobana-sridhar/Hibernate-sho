package com.iprimed.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String name;
	private double salary;
	
//Cascade Operations-->ALL(merge,remove,refresh,persist,detach..)
//FetchType -EAGER -loads both tables data at the time of retrieval /LAZY-loads only particular table properties alone
@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@JoinColumn(name="emp_dept")
private Department department;
	
public Emp() {}
	
	public Emp(int empId,String name,double salary,Department department)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}

	public int getEmpId() {
		return empId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
