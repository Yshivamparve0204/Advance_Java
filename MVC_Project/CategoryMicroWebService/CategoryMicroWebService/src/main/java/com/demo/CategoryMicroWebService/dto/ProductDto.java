package com.demo.CategoryMicroWebService.dto;

public class ProductDto {
private int pid;
private String pname;
private int qty;
private double price;
private  String ldtstr;
public ProductDto() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductDto(int pid, String pname, int qty, double price, String ldtstr) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.ldtstr = ldtstr;
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
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getLdtstr() {
	return ldtstr;
}
public void setLdtstr(String ldtstr) {
	this.ldtstr = ldtstr;
}
@Override
public String toString() {
	return "ProductDto [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ldtstr=" + ldtstr
			+ "]";
}


}
