package com.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Course;
import com.beans.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sf=new Configuration().configure().buildSessionFactory();
Session session=sf.openSession();
Transaction tr=session.beginTransaction();
Course c1=new Course(11,"java",2000.00,LocalDate.of(2014,04,05));
Course c2=new Course(12,"advance java",2000.00,LocalDate.of(2015,05,11));
Course c3=new Course(13,"c++",2000.00,LocalDate.of(2020,04,03));
Student s1=new Student(1,"abc",LocalDate.of(2021,02,04),c1);
Student s2=new Student(2,"pqr",LocalDate.of(2022,06,07),c1);
Student s3=new Student(3,"xyz",LocalDate.of(2024,07,10),c2);
Student s4=new Student(4,"qrs",LocalDate.of(2019,03,06),c3);
Set<Student>cset=new HashSet<Student>();
cset.add(s1);
cset.add(s2);
cset.add(s3);
cset.add(s4);
Set<Course>csett=new HashSet<Course>();
csett.add(c1);
csett.add(c2);
csett.add(c3);
session.save(s1);
session.save(s2);
session.save(s3);
session.save(s4);
session.save(c1);
session.save(c2);
session.save(c3);
tr.commit();
session.close();
sf.close();


	}

}
