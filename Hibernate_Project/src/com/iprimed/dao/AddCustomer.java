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
			//create object
			
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
	}

}
