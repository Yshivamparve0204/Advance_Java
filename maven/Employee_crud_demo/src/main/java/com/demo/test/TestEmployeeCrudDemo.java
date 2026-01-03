package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestEmployeeCrudDemo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    EmployeeService eservice = new EmployeeServiceImpl();
    ProjectService pservice=new ProjectServiceImpl();
    
    int choice=0;
    do {
		System.out.println("1. Add project");
		System.out.println("2. Add Employees");
	    System.out.println("3. show all employees");
	    System.out.println("4. delete employee");
		System.out.println("5. update Employees salary");
		System.out.println("6. add Employees in existing project");
		System.out.println("7. display Employees in sorted order");
	    System.out.println("8. exit\nchoice:");
	    choice=sc.nextInt();
	    switch(choice) {
	    case 1:{
	    	pservice.addNewProject();
	    	break;
	    }
	    case 2:{
	    	boolean status=eservice.addNewEmployee();
	    	if(status)
	    	{
	    		System.out.println("employee added successfully");
	    	}
	    	else {
	    		System.out.println("not added");
	    	}
	    	break;
	    }
	    case 3:{
	    	List<Employee>lt=eservice.getAllEmp();
	    	for(Employee e:lt)
	    	{
	    		System.out.println(e);
	    	}
	    	break;
	    }
	    case 4:{
	    	System.out.println("enter the id of emp:");
	    	int id=sc.nextInt();
	    	boolean status=eservice.deleteEmp(id);
	    	if(status)
	    	{
	    		System.out.println("deleted successfully");
	    	}
	    	else {
	    		System.out.println("not found");
	    	}
	    	break;
	    }
	    case 5:{
	    	System.out.println("enter the emp id to update:");
	    	int id=sc.nextInt();
	    	System.out.println("enter the emp salary to update:");
	    	double sal=sc.nextDouble();
	    	  boolean status=eservice.updateEmp(id,sal);
	    	  if(status)
	    	  {
	    		  System.out.println("salary update successfully");
	    	  }else {
	    		  System.out.println("not updated");
	    	  }
	    }
	    case 6:{
	    	System.out.println("enter employee id to add in project:");
	    	int eid=sc.nextInt();
	    	System.out.println("enetr project id to add:");
	    	int pid=sc.nextInt();
	    	boolean status=eservice.addEmpToProject(eid,pid);
	    	if(status)
	    	{
	    		System.out.println("added successfully");
	    	}else {
	    		System.out.println("not added");
	    	}
	    	break;
	    }
	    case 7:{
	    	List<Employee>lt=eservice.sortByEmpSal();
	    	for(Employee e:lt)
	    		System.out.println(e);
	    	break;
	    }
	    case 8:{
	    	
	    }
	    }
    }while(choice!=8);
    		

	}

}
