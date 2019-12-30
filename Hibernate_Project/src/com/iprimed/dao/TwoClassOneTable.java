package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Employee;
import com.iprimed.bean.EmployeeDetails;
import com.iprimed.bean.Student;

public class TwoClassOneTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeDetails.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			//EmployeeDetails bean class object
			EmployeeDetails empDetails=new EmployeeDetails(35,"Chennai");
			
			//Employee bean class object
			Employee emp=new Employee(2001,"Shobana",45500,empDetails);
//			emp.setEmpId(2001);
//			emp.setName("Shobana");
//			emp.setSalary(45500);
//			emp.setEmpDetails(empDetails);
			
			//begin transaction
			session.beginTransaction();
			
			//save objects
			session.save(emp);
			
			//commit changes
			session.getTransaction().commit();
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}

	}

}
