package com.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("nonperishableproduct")
public class NonPerishableProduct extends Product{
private int guarantee;

public NonPerishableProduct() {
	super();
	// TODO Auto-generated constructor stub
}

public NonPerishableProduct(int id, String name, int qty, double price, LocalDate mfgdate,int guarantee) {
	super(id, name, qty, price, mfgdate);
this.guarantee=guarantee;
}
public int getGuarantee() {
	return guarantee;
}

public void setGuarantee(int guarantee) {
	this.guarantee = guarantee;
}

@Override
public String toString() {
	return super.toString()+"NonPerishableProduct [guarantee=" + guarantee + "]";
}

}
