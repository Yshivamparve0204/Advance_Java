package com.demo.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="project33")
public class Project {
	@Id
private int pid;
private String pname;
private LocalDate StartDate;
@ManyToMany(mappedBy="pset", cascade=CascadeType.ALL)
Set<Employee>est=new HashSet<Employee>();
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int pid, String pname, LocalDate startDate) {
	super();
	this.pid = pid;
	this.pname = pname;
	StartDate = startDate;
}
public Project(int pid, String pname, LocalDate startDate, Set<Employee> est) {
	super();
	this.pid = pid;
	this.pname = pname;
	StartDate = startDate;
	this.est = est;
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public LocalDate getStartDate() {
	return StartDate;
}
public void setStartDate(LocalDate startDate) {
	StartDate = startDate;
}
public Set<Employee> getEst() {
	return est;
}
public void setEst(Set<Employee> est) {
	this.est = est;
}
@Override
public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname + ", StartDate=" + StartDate + ", est=" + est + "]";
}


}
