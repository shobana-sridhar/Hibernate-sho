package com.iprimed.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Customer;

public class VariousOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		//Where,like,order,join,in
		try {
			session.beginTransaction();
			//Where
			List<Customer> customer = session.createQuery("from Customer where email='shobana@h.com'").getResultList();
			
			Iterator<Customer>itr=customer.iterator();
			while(itr.hasNext()) {
				Customer c=itr.next();
				System.out.println(c.getId()+":"+c.getName()+":"+c.getEmail()+":"+c.getMobile());
			}
			//like
			List<Customer> customer1 = session.createQuery("from Customer c where"+" c.name like '%5'").getResultList();
			
			Iterator<Customer>itr1=customer1.iterator();
			while(itr1.hasNext()) {
				Customer c=itr1.next();
				System.out.println(c.getId()+":"+c.getName()+":"+c.getEmail()+":"+c.getMobile());
			}
			
			//'or'
			List<Customer> customer2 = session.createQuery("from Customer c where"+" c.name like '%14'"+" or c.name like '%4'").getResultList();
			
			Iterator<Customer>itr2=customer2.iterator();
			while(itr2.hasNext()) {
				Customer c=itr2.next();
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
