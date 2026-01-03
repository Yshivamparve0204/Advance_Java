package com.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
//@Entity
@Table(name="product11")
@MappedSuperclass
public class Product {
	@Id
private int id;
private String name;
private int qty;
private double price;
private LocalDate mfgdate;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, int qty, double price, LocalDate mfgdate) {
	super();
	this.id = id;
	this.name = name;
	this.qty = qty;
	this.price = price;
	this.mfgdate = mfgdate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public LocalDate getMfgdate() {
	return mfgdate;
}
public void setMfgdate(LocalDate mfgdate) {
	this.mfgdate = mfgdate;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate + "]";
}

}
