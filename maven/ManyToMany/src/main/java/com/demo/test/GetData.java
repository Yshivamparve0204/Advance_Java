package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class GetData {
public static void main(String[]args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	 System.out.println("before get project");
	 Project p = session.get(Project.class, 11);
	 System.out.println("after get project");
	 System.out.println(p);
	
	 System.out.println("before get Employee");
	 Employee e = session.get(Employee.class, 1);
	 System.out.println("after get employee");
	 System.out.println(e);
	 System.out.println(e.getPset());
	tr.commit();
	session.close();
	sf.close();
}
}
