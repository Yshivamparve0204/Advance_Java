package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceimpl implements EmployeeService{

	EmployeeDao edao;
	Scanner sc=new Scanner(System.in);
	public EmployeeServiceimpl() {
		edao=new EmployeeDaoImpl();
	}
	@Override
	public List<Employee> displayAll() {
		
		return edao.findAll();
	}
	@Override
	public void getCloseMyConnection() {
		edao.getCloseMyConnection();
		
	}
	@Override
	public boolean deleteById(int empno) {
		
		return edao.removeById(empno);
	}
	@Override
	public Employee findById(int empno) {
		
		return edao.showById(empno);
	}
	@Override
	public List<Employee> displayAllInSorted() {
		
		return edao.getAllInSorted();
	}
	@Override
	public List<Employee> displayByName(String ename) {
		
		return edao.showByName(ename);
	}
	@Override
	public boolean addEmployee() {
		System.out.println("Enter empno:");
		int empno=sc.nextInt();
		System.out.println("Enter name:");
		String ename=sc.next();
		System.out.println("Enter gender:");
		String gender=sc.next();
		System.out.println("Enter job:");
		String job=sc.next();
		System.out.println("Enter mgr:");
		int mgr=sc.nextInt();
		System.out.println("Enter hiredate:");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter sal:");
		double sal=sc.nextDouble();
		System.out.println("Enter comm:");
		double comm=sc.nextDouble();
		System.out.println("Enter deptno:");
		int deptno=sc.nextInt();
		System.out.println("Enter bonusid:");
		int bonusid=sc.nextInt();
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter pwd:");
        String pwd=sc.next();
        System.out.println("Enter phone:");
        String phone=sc.next();
        System.out.println("Enter isactive:");
        String isactive=sc.next();
        Employee e=new Employee(empno,ename,gender,job,mgr,ldt,sal,comm,deptno,bonusid,username,pwd,phone,isactive);
		return edao.save(e);
	}
	@Override
	public boolean modifyById(int empno, double sal) {
		
		return edao.updateSal(empno,sal);
	}
}
