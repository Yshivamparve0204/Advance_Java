package com.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.NonPerishableProduct;
import com.beans.PerishableProduct;
import com.beans.Product;

public class TestGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(PerishableProduct.class, 11);
		Product p1=session.get(NonPerishableProduct.class, 12);
		System.out.println(p);
		System.out.println(p1);
		tr.commit();
		session.close();
		sf.close();
	}

}
