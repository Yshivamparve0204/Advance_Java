package com.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Perishable")
public class PerishableProduct extends Product {
private LocalDate expdate;

public PerishableProduct() {
	super();
	// TODO Auto-generated constructor stub
}

public PerishableProduct(int id, String name, int qty, double price, LocalDate mfgdate,LocalDate expdate) {
	super(id, name, qty, price, mfgdate);
	this.expdate=expdate;
}

public LocalDate getExpdate() {
	return expdate;
}

public void setExpdate(LocalDate expdate) {
	this.expdate = expdate;
}

@Override
public String toString() {
	return super.toString()+"PerishableProduct [expdate=" + expdate + "]";
}

}
