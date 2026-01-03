package com.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class RegistrationForm {
@NotBlank private String userid;
 @NotBlank private String name;
 private String gender;
 @Past(message="dob must be in past")
 @DateTimeFormat(pattern="yyyy-MM-dd")
 private LocalDate dob;
 @NotBlank private String username;
 @NotBlank @Size(min=6)private String password;
 private String comfirmpassword;
 private String[]skills;
 private MultipartFile photo;
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
public String getComfirmpassword() {
	return comfirmpassword;
}
public void setComfirmpassword(String comfirmpassword) {
	this.comfirmpassword = comfirmpassword;
}
public String[] getSkills() {
	return skills;
}
public void setSkills(String[] skills) {
	this.skills = skills;
}
public MultipartFile getPhoto() {
	return photo;
}
public void setPhoto(MultipartFile photo) {
	this.photo = photo;
}
 
}
