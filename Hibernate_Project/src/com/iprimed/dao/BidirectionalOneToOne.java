package com.iprimed.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iprimed.bean.Child;
import com.iprimed.bean.Department;
import com.iprimed.bean.Emp;
import com.iprimed.bean.Employee;
import com.iprimed.bean.Parent;

public class BidirectionalOneToOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Parent.class).addAnnotatedClass(Child.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try
		{
			//Initially values passed and then mapping done
//			Department dept=new Department();
//			dept.setDeptId(1002);
//			dept.setDeptName("ECE");
//			
//			
//			Emp emp=new Emp();
//			emp.setEmpId(98);
//			emp.setName("Lakshmi");
//			emp.setSalary(35000);
//			emp.setDepartment(dept);
			
		
			session.beginTransaction();
			
			//Department table helps in mapping to Employee table
			Department dept=session.get(Department.class,1002);
			System.out.println(dept.getEmployee());
			System.out.println(dept.getDeptName());
			
			Emp emp=dept.getEmployee();
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			
			session.save(emp);
			session.save(dept);
			
			session.getTransaction().commit();
			
		}
		finally {
			//sessions are closed
			session.close();
			factory.close();
		}
		

	}


}




