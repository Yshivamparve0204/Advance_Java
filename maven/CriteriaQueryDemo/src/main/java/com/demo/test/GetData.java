package com.demo.test;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class GetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr =session.beginTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		
	   // fetch employee whose sal is >22000
//		cq.select(root)
//		.where(cb.equal(root.get("sal"),22000)
//				);
//		List<Employee>elist = session.createQuery(cq).getResultList();
//		 for(Employee e: elist) {
//			 System.out.println(e);
//		 }

		//fetch all employee where dept = hr and sal>20000
//		cq.select(root)
//		.where(cb.and(
//				cb.equal(root.get("dept"),"HR"),
//				cb.gt(root.<Double>get("sal"),20000)
//				));
//		
//		List<Employee>elist = session.createQuery(cq).getResultList();
//		for(Employee e : elist) {
//			System.out.println(e);
//		}
		
//		Predicate p1 = cb.equal(root.get("dept"), "HR");
//		Predicate p2 = cb.gt(root.<Double>get("sal"), 20000);
//		Predicate p3 = cb.lt(root.<Integer>get("eid"), 1);
//		
//		cq.where(p1);
//		
//		List<Employee>elist = session.createQuery(cq).getResultList();
//		for(Employee e : elist) {
//			System.out.println(e);
//		}
		
		cq.where(
			    cb.or(
			        cb.like(root.<String>get("ename"), "s%"),
			        cb.like(root.<String>get("ename"), "k%")
			    )
			);
		List<Employee> elist = session.createQuery(cq).getResultList();
		for(Employee e :elist) {
			System.out.println(e);
		}
		
		
		tr.commit();
		session.close();
		sf.close();



	}

}
