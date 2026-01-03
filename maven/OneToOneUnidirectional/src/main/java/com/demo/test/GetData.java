package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class GetData {

	public static void main(String[] args) {
	 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	 Session session = sf.openSession();
	 Transaction tr = session.beginTransaction();
	 System.out.println("before load");
	 MyUser u = session.load(MyUser.class,1 );
	 Address a = session.load(Address.class,2);
	 System.out.println("after load");
	 System.out.println(u);
	 System.out.println(a);
	 
	 tr.commit();
	 session.close();
	 sf.close();
	}

}
