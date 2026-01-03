package com.demo.test;
import com.demo.beans.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMyUser {
public static void main(String[]args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
//	MyUser u1= new MyUser(10,"shivam","shivam@gmail.com");
//	MyUser u2 = new MyUser(11,"parve","parve@gmail.com");
	Product p1 = new Product("table", 34,5000);
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
//	session.save(u1);
//	session.save(u2);
	session.save(p1);
	tr.commit();
	session.close();
	sf.close();
}
}
