package com.beans;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="student11")
public class Student {
	@Id
private int sid;
private String sname;
private LocalDate cstartdate;
@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="cid")
private Course course;
public Student() {
	super();

}
public Student(int sid, String sname, LocalDate cstartdate, Course course) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.cstartdate = cstartdate;
	this.course = course;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public LocalDate getCstartdate() {
	return cstartdate;
}
public void setCstartdate(LocalDate cstartdate) {
	this.cstartdate = cstartdate;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", cstartdate=" + cstartdate + ", course=" + course + "]";
}




}
