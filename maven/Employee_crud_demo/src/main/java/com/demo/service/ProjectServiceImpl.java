package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Project;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService{
private ProjectDao pdao;
public ProjectServiceImpl()
{
	pdao=new ProjectDaoImpl();
	
}
	public void addNewProject() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pid");
		int pid=sc.nextInt();
		System.out.println("enter the pname");
		String pname=sc.next();
		System.out.println("enter the start date(dd/mm/yyyy)");
		String d=sc.next();
		LocalDate ldt=LocalDate.parse(d, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Project p=new Project(pid,pname,ldt);
		pdao.save(p);
	}

}
