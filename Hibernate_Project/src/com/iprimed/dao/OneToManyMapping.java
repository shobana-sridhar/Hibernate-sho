package com.iprimed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.iprimed.bean.College;

import com.iprimed.bean.StudentCol;

public class OneToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentCol.class).addAnnotatedClass(College.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			
			//create objects
			
		/*	College college=new College();
			college.setCollegeId(1001);
			college.setCollegeName("Layola");
			
			
			StudentCol std1=new StudentCol(100,"Shobana",college);
			StudentCol std2=new StudentCol(101,"Lakshmi",college);
			StudentCol std3=new StudentCol(102,"Sridhar",college);
			
			//Add students to college
			college.getStudent().add(std1);
			college.getStudent().add(std2);
			college.getStudent().add(std3);
			
			session.beginTransaction();
			
			session.save(college);
			session.save(std1);
			session.save(std2);
			session.save(std3);*/
			
			session.beginTransaction();
			StudentCol stud=session.get(StudentCol.class,102);
			System.out.println(stud.getName());
			College col=stud.getCollege();
			System.out.println(col.getCollegeName());
			
			
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
