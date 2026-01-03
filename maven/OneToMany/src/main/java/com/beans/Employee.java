package com.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="emp111")
public class Employee {
	@Id
private int eid;
private String ename;
private LocalDate hiredate;
private double sal;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="deptid")
private Department dept;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, LocalDate hiredate, double sal, Department dept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.hiredate = hiredate;
	this.sal = sal;
	this.dept = dept;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public LocalDate getHiredate() {
	return hiredate;
}
public void setHiredate(LocalDate hiredate) {
	this.hiredate = hiredate;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", dept=" + dept
			+ "]";
}

}
