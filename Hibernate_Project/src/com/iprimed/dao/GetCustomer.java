package com.iprimed.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class GetCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			//Retrieving data from database using the id
			int custId=1;
			session.beginTransaction();
			Customer customer=session.get(Customer.class,custId);
			System.out.println(customer.getName()+":"+customer.getEmail()+":"+customer.getMobile());
			
			//For listing all records from database
			List<Customer> cust=session.createQuery("from Customer").getResultList();
			
			Iterator<Customer>itr=cust.iterator();
			while(itr.hasNext()) {
				Customer c=itr.next();
				System.out.println(c.getId()+":"+c.getName()+":"+c.getEmail()+":"+c.getMobile());
			}
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
	}

}
