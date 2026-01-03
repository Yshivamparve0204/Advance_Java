package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceimpl;
import com.demo.model.Employee;
public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceimpl();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
        	System.out.println("1.Add employee\n2.delete by id\n3.modify employee");
    		System.out.println("4.display all\n5.display by id\n6.display by ename");
    		System.out.println("7.display in sorted order\n8.exit\n choice: ");
    		choice=sc.nextInt();
    		switch(choice) {
    		case 1:
    			boolean status=eservice.addEmployee();
    			if(status) {
    				System.out.println("Employee added successfully");
    			}else {
    				System.out.println("Error occcured");
    			}
    			break;
    		case 2:
    			System.out.println("Enter id of employee:");
    			int empno=sc.nextInt();
    			status=eservice.deleteById(empno);
    			if(status) {
    				System.out.println("Employee deleted successfully");
    			}else {
    				System.out.println("Employee not found");
    			}
    			break;
    		case 3:
    			System.out.println("Enter id to modify :");
    			empno=sc.nextInt();
    			System.out.println("Enter salary:");
    			double sal=sc.nextDouble();
    			status=eservice.modifyById(empno,sal);
    			if(status) {
    				System.out.println("Employee updated successfully");
    			}else {
    				System.out.println("Employee not found");
    			}
    			
    			
    			break;
    		case 4:
    			List<Employee> elist=eservice.displayAll();
    			elist.forEach(System.out::println);
    			break;
    		case 5:
    			System.out.println("Enter id of employee:");
    			empno=sc.nextInt();
    			Employee e=eservice.findById(empno);
    			System.out.println(e);
    			break;
    		case 6:
    			System.out.println("Enter name of employee:");
    			String ename=sc.next();
    			elist=eservice.displayByName(ename);
			    elist.forEach(System.out::println);
    			break;
    		case 7:
    			 elist=eservice.displayAllInSorted();
    			 elist.forEach(System.out::println);
    			break;
    		case 8:
    			sc.close();
    			eservice.getCloseMyConnection();
    			System.out.println("Thank you for visiting.....");
    			break;
    		default:
    			System.out.println("Wrong choice");
    		}
        }while(choice!=8);
	}

}
