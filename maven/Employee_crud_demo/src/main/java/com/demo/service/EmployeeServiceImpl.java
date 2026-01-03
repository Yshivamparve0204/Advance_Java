package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao edao;
private ProjectDao pdao;
public EmployeeServiceImpl()
{
	edao=new EmployeeDaoImpl();
	pdao=new ProjectDaoImpl();
}
	public boolean addNewEmployee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter hiredate(dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter the sal:");
		double sal=sc.nextDouble();
		System.out.println("enter project id:");
		String pid=sc.next();
		String arr[]=pid.split(",");
		Set<Project>pset=pdao.findByPid(arr);
		Employee e=new Employee(id,name,ldt,sal,pset);
		
		return edao.save(e);
	}
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return edao.findAllEmp();
	}
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return edao.removeEmp(id);
	}
	public boolean updateEmp(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.updateEmp(id,sal);
	}
	public boolean addEmpToProject(int eid, int pid) {
		// TODO Auto-generated method stub
		Employee e=edao.findById(eid);
		Project p=pdao.findByPid(pid);
		if(e!=null && p!=null)
		{
			return edao.addEmpToPro(e,p);
		}
		return false;
	}
	public List<Employee> sortByEmpSal() {
		// TODO Auto-generated method stub
		return edao.orderBySal();
	}

}
