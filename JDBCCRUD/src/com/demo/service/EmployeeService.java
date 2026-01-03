package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> displayAll();

	void getCloseMyConnection();

	boolean deleteById(int empno);

	Employee findById(int empno);

	List<Employee> displayAllInSorted();

	List<Employee> displayByName(String ename);

	boolean addEmployee();

	boolean modifyById(int empno, double sal);

}
