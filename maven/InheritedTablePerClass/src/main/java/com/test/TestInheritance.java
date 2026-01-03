package com.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.NonPerishableProduct;
import com.beans.PerishableProduct;
import com.beans.Product;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sf=new Configuration().configure().buildSessionFactory();
Session session=sf.openSession();
Transaction tr=session.beginTransaction();
Product p=new PerishableProduct(11,"lays",34,45,LocalDate.of(2013, 04, 03),LocalDate.of(2015, 04, 03));
Product p1=new NonPerishableProduct(12,"chair",45,4567.0,LocalDate.of(2013, 04, 03),11);
session.save(p);
session.save(p1);
tr.commit();
session.close();
sf.close();
	}

}
