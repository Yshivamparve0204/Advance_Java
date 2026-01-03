package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestData {
 public static void main(String[] args) {
	 
	 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	 Session session = sf.openSession();
	 Transaction tr = session.beginTransaction();
     Address a1 = new Address(10,"s.b.road","pune","411016");
     Address a2 = new Address(11,"ozar.road","narayangaon","410511");
     MyUser u1 = new MyUser(1,"shiv","7219663832",a1);
     MyUser u2 = new MyUser(2,"shivam","7219663832",a2);
     session.save(a1);
     session.save(a2);
     session.save(u1);
     session.save(u2);
     
     
	 
	 tr.commit();
	 session.close();
	 sf.close();
 }
}
