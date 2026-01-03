package com.demo.beans;

import java.time.LocalDate;

public class MyRegisterUser {
private Integer id;
private String userid;
private String name;
private String gender;
private LocalDate dob;
private String username;
private String password;
private String skills;
String photopath;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}
public String getPhotopath() {
	return photopath;
}
public void setPhotopath(String photopath) {
	this.photopath = photopath;
}


}
