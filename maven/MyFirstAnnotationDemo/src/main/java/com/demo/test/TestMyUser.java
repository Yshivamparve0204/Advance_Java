package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
//		
//		MyUser u1 = new MyUser( 1 , "yogesh" , "yogesh@gmail.com");
//		MyUser u2 = new MyUser( 2 , "shivam" , "shivam@gmail.com");
//	    session.save(u1);
//	    session.save(u2);
	 MyUser u=	session.get(MyUser.class, 2);
		System.out.println(u);
	    tr.commit();
	    session.close();
	    sf.close();                                                                                                                                                            

	}

}
