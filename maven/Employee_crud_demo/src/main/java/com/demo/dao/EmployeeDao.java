package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmp();

	boolean removeEmp(int id);

	boolean updateEmp(int id, double sal);

	boolean addEmpToPro(Employee e,Project p);

	Employee findById(int eid);

	List<Employee> orderBySal();

}
