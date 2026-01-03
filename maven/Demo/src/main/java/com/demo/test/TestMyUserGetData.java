package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

public class TestMyUserGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		
		MyUser u = session.get(MyUser.class, 10);
		Product p = session.get(Product.class, 1);
		tr.commit();
		System.out.println(u);
		System.out.println(p);
		session.close();
		sf.close();

	}

}
