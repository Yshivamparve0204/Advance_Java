package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	List<Employee> findAll();

	void getCloseMyConnection();

	boolean removeById(int empno);

	Employee showById(int empno);

	List<Employee> getAllInSorted();

	List<Employee> showByName(String ename);

	boolean save(Employee e);

	boolean updateSal(int empno, double sal);

}
