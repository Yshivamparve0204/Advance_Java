package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> getAllEmp();

	boolean deleteEmp(int id);

	boolean updateEmp(int id, double sal);

	boolean addEmpToProject(int eid, int pid);

	List<Employee> sortByEmpSal();



}
