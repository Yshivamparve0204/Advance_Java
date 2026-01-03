package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class EmployeeDaoImpl implements EmployeeDao {
static SessionFactory sf;
static {
	sf=HibernateUtil.getMySessionFactory();
}
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		return true;
	}
	public List<Employee> findAllEmp() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		List<Employee>el=session.createQuery("from Employee",Employee.class).list();
		tr.commit();
		session.close();
		return el;
	}
	public boolean removeEmp(int id) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		boolean flag=false;
		Employee e=session.get(Employee.class, id);
		if(e!=null)
		{
			session.delete(e);
			flag=true;
		}
		tr.commit();
		session.close();
		return flag;
		

	}
	public boolean updateEmp(int id, double sal) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		boolean flag=false;
		Employee e=session.get(Employee.class,id);
		if(e!=null)
		{
			e.setSal(sal);
			session.merge(e);
			flag=true;
		}
		tr.commit();
		session.close();
		return flag;
	}
	public boolean addEmpToPro(Employee e,Project p) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		e.getPset().add(p);
		p.getEst().add(e);
		tr.commit();
		session.close();
		
		return true;
	}
	public Employee findById(int eid) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e=session.get(Employee.class,eid);
		tr.commit();
		session.close();
		return e;
	}
	public List<Employee> orderBySal() {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		List<Employee>el=session.createQuery("from Employee e1 order by e1.sal",Employee.class).list();
		tr.commit();
		session.close();
		return el;
	}

}
