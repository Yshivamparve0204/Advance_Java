package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = new Employee(1,"shiv",LocalDate.of(2022, 05, 04),50000);
		Employee e2 = new Employee(2,"shashu",LocalDate.of(2025, 05, 01),55000);
		Employee e3 = new Employee(3,"sammy",LocalDate.of(2022, 04, 23),34000);
		Employee e4 = new Employee(4,"sarvesh",LocalDate.of(2020, 11, 12),90000);
		Set<Employee>eset1 = new HashSet<Employee>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		Set<Employee>eset2 = new HashSet<Employee>();
		eset2.add(e2);
		eset2.add(e3);
		eset2.add(e4);
		Project p1 = new Project(10,"pr1",LocalDate.of(2022, 02, 03),eset1);
		Project p2 = new Project(11,"pr2",LocalDate.of(2022, 02, 03),eset2);
		Project p3 = new Project(12,"pr3",LocalDate.of(2022, 02, 03),eset1);
		Set<Project>pset1 = new HashSet<Project>();
		pset1.add(p1);
		pset1.add(p3);
		e1.setPset(pset1);
		Set<Project>pset2 = new HashSet<Project>();
		pset2.add(p1);
		pset2.add(p2);
		pset2.add(p3);
		e2.setPset(pset2);
		e3.setPset(pset2);
		Set<Project>pset3= new HashSet<Project>();
		pset3.add(p2);
		e4.setPset(pset3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		session.close();
		sf.close();
	
	}

}
