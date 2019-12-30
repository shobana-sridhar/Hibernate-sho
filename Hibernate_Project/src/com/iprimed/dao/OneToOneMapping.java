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
			Department dept=new Department(1001,"CSE");
			Emp emp=new Emp(22,"Shobana",45500,dept);
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
		

	}

}
