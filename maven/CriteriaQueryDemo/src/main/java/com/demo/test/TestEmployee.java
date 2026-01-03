package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr =session.beginTransaction();
		Employee e1= new Employee("shivam",20000,"HR",23);
		Employee e2= new Employee("bide",20400,"manager",23);
		Employee e3= new Employee("shashank",20500,"HR",24);
		Employee e4= new Employee("raju",22000,"clerk",22);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
			
		tr.commit();
		session.close();
		sf.close();

	}

}
