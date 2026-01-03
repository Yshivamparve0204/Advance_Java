package com.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="course11")
public class Course {
	@Id
private int cid;
private String cname;
private Double Cprice;
private LocalDate startDate;
@OneToMany(mappedBy="course")
Set<Student>set=new HashSet<Student>();
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int cid, String cname, Double cprice, LocalDate startDate) {
	super();
	this.cid = cid;
	this.cname = cname;
	Cprice = cprice;
	this.startDate = startDate;
}
public Course(int cid, String cname, Double cprice, LocalDate startDate, Set<Student> set) {
	super();
	this.cid = cid;
	this.cname = cname;
	Cprice = cprice;
	this.startDate = startDate;
	this.set = set;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Double getCprice() {
	return Cprice;
}
public void setCprice(Double cprice) {
	Cprice = cprice;
}
public LocalDate getStartDate() {
	return startDate;
}
public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}
public Set<Student> getSet() {
	return set;
}
public void setSet(Set<Student> set) {
	this.set = set;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", Cprice=" + Cprice + ", startDate=" + startDate + ", set="
			+ set + "]";
}


}
