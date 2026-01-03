package com.demo.beans;

public class Skill {
private int skid;
private String skname;
private int experiance;
public Skill() {
	super();
	// TODO Auto-generated constructor stub
}
public Skill(int skid, String skname, int experiance) {
	super();
	this.skid = skid;
	this.skname = skname;
	this.experiance = experiance;
}
public int getSkid() {
	return skid;
}
public void setSkid(int skid) {
	this.skid = skid;
}
public String getSkname() {
	return skname;
}
public void setSkname(String skname) {
	this.skname = skname;
}
public int getExperiance() {
	return experiance;
}
public void setExperiance(int experiance) {
	this.experiance = experiance;
}
@Override
public String toString() {
	return "Skill [skid=" + skid + ", skname=" + skname + ", experiance=" + experiance + "]";
}


}
