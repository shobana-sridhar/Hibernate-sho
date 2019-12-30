package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;
import com.iprimed.bean.Student;

public class SingleClassMultipleTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			//creating object
			Student std=new Student();
			std.setStudentName("Shobana");
			std.setAge(22);
			
			//Begin Transaction
			session.beginTransaction();
			
			//save object
			session.save(std);
			
			//commit object
			session.getTransaction().commit();
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}

	}

}
