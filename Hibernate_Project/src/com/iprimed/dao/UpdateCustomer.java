package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class UpdateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			//Updating a record using id
			int custId=0;
			
			session.beginTransaction();
			System.out.println("Transaction Begins....");
			
			Customer customer=session.get(Customer.class, custId);
			System.out.println("Got Customer id for change.....");
			
			//updating customer 
			//case 1
			customer.setEmail("shobana@h.com");
			//case 2
			int result=session.createQuery("update Customer set email='yahoo.co.in' where id=1").executeUpdate();
			System.out.println("Updated value is got....");
			
			System.out.println("Result is:"+result);
			
			System.out.println("Updated Successfully....");
			
			session.getTransaction().commit();
			System.out.println("Commited changes successfully...");
			
			
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}

	}

}
