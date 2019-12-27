package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class DeleteCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			
			//Delete an customer using id
			int custId=1;
			session.beginTransaction();
			Customer customer=session.get(Customer.class,custId);
			//delete
			session.delete(customer);
			System.out.println("Customer record deleted successfully");
			
			session.getTransaction().commit();
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}


	}

}
