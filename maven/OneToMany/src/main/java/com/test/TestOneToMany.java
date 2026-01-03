package com.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Department;
import com.beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sf=new Configuration().configure().buildSessionFactory();
Session session=sf.getCurrentSession();
Transaction tr=session.beginTransaction();
Department d1=new Department(1,"gaming","pune");
Department d2=new Department(2,"hr","pune");
Department d3=new Department(3,"manager","pune");
Employee e1=new Employee(11,"abc",LocalDate.of(2020, 05, 04),45000,d1);
Employee e2=new Employee(12,"pqr",LocalDate.of(2021, 06, 04),35000,d1);
Employee e3=new Employee(13,"abc",LocalDate.of(2019, 07, 05),25000,d2);
Employee e4=new Employee(14,"abc",LocalDate.of(2018, 05, 02),5000,d1);
Set<Employee>set=new HashSet<Employee>();
set.add(e1);
set.add(e2);
set.add(e4);
Set<Employee>set1=new HashSet<Employee>();
set1.add(e3);
d1.setEset(set);
d2.setEset(set1);
session.save(d1);
session.save(d2);
session.save(e1);
session.save(e2);
session.save(e3);
session.save(e4);
tr.commit();
sf.close();




	}

}
