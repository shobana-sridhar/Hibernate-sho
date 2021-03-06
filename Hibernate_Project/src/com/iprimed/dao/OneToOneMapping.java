package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Child;
import com.iprimed.bean.Department;
import com.iprimed.bean.Emp;
import com.iprimed.bean.Parent;

public class OneToOneMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Parent.class).addAnnotatedClass(Child.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try
		{
			//Initially values passed and then mapping done
//			Department dept=new Department(1001,"CSE");
//			Emp emp=new Emp(22,"Shobana",45500,dept);
//			
			session.beginTransaction();
			
			//Employee table mapping to Department table
			Emp emp=session.get(Emp.class,22);
			System.out.println(emp.getName());
			System.out.println((emp.getDepartment()));
			
			Department dept=emp.getDepartment();
			System.out.println(dept.getDeptId());
			System.out.println(dept.getDeptName());
			session.save(emp);
			
			session.getTransaction().commit();
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
		

	}

}
