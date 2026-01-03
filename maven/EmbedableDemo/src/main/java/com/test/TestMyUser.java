package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Address;
import com.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
	
SessionFactory sf=new  Configuration().configure().buildSessionFactory();
Session session=sf.openSession();
Transaction tr=session.beginTransaction();
Address a1 = new Address(7,"f.c","pune","411015");
MyUser u11 = new MyUser(3,"raj","23846",a1);
//System.out.println("before get");
//MyUser u1=session.get(MyUser.class,2);
//System.out.println("after get");
//System.out.println(u1);
session.save(a1);
session.save(u11);
tr.commit();
session.close();
sf.close();


	}

}
