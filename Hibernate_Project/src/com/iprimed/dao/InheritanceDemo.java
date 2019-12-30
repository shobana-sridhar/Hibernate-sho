package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Child;
import com.iprimed.bean.Employee;
import com.iprimed.bean.EmployeeDetails;
import com.iprimed.bean.GrandChild;
import com.iprimed.bean.Parent;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Parent.class).addAnnotatedClass(Child.class).addAnnotatedClass(GrandChild.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			Parent p= new Parent(1001,"Parent1");
			Child c=new Child(2001,"Child1");
			GrandChild gc=new GrandChild(3001,"GrandChild1");
			
			session.beginTransaction();
			
			session.save(p);
			session.save(c);
			session.save(gc);
			
			session.getTransaction().commit();
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
		

	}

}
