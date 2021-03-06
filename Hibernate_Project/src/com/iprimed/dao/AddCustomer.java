package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class AddCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			//Simple Scenario
			
			//create object
			
			Customer customer=new Customer("Hemi14","hem@yahoo.com",1847520365);
			System.out.println("Object created...");
			//start transaction
			session.beginTransaction();
			System.out.println("Transcation begins...");
			//Save object into the database
			session.save(customer);
			System.out.println("Object saved...");
			//commit changes in database
			
			session.getTransaction().commit();
			System.out.println("Commited changes succesfully...");
			
			
			
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
	}

}
