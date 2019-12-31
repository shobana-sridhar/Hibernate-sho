package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.iprimed.bean.Delegate;
import com.iprimed.bean.Event;



public class ManyToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Delegate.class).addAnnotatedClass(Event.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			
				Delegate d1=new Delegate();
				d1.setDelegateId(101);
				d1.setDelegateName("Delegate1");
				Delegate d2=new Delegate();
				d2.setDelegateId(102);
				d2.setDelegateName("Delegate2");
				Delegate d3=new Delegate();
				d3.setDelegateId(103);
				d3.setDelegateName("Delegate3");
				Delegate d4=new Delegate();
				d4.setDelegateId(104);
				d4.setDelegateName("Delegate4");
				
				Event e1=new Event();
				e1.setEventId(201);
				e1.setEventName("Event1-Dance");
				Event e2=new Event();
				e2.setEventId(202);
				e2.setEventName("Event2-Music");
				Event e3=new Event();
				e3.setEventId(203);
				e3.setEventName("Event3-Comedy");
				
				
				d1.getEvent().add(e1);
				d2.getEvent().add(e2);
				d3.getEvent().add(e3);
				d4.getEvent().add(e1);
				
				e1.getDelegate().add(d1);
				e1.getDelegate().add(d4);
				e2.getDelegate().add(d2);
				e3.getDelegate().add(d3);
				
				
				session.beginTransaction();
				
				session.save(d1);
				session.save(d2);
				session.save(d3);
				session.save(d4);
				
				session.save(e1);
				session.save(e2);
				session.save(e3);
				
				
				session.getTransaction().commit();
				
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
