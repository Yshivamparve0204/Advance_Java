package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Project;

public class ProjectDaoImpl implements ProjectDao {
static SessionFactory sf=null;
static {
	sf=HibernateUtil.getMySessionFactory();
}
	public void save(Project p) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();
	}
	public Set<Project> findByPid(String[] arr) {
		// TODO Auto-generated method stub
		Set<Project>pset=new HashSet<Project>();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		for(String pid:arr)
		{
			Project p=session.get(Project.class,Integer.parseInt(pid));
			pset.add(p);
		}
		tr.commit();
		session.close();
		return pset;
	}
	public Project findByPid(int pid) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Project p=session.get(Project.class, pid);
		tr.commit();
		session.close();
		return p;
	}

}
