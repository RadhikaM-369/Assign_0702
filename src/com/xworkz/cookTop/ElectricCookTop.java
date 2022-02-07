package com.xworkz.cookTop;

public class ElectricCookTop {
private String brand;
private double weight;
private String color;
private String customer;
private int warranty;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCustomer() {
	return customer;
}
public void setCustomer(String customer) {
	this.customer = customer;
}
public int getWarranty() {
	return warranty;
}
public void setWarranty(int warranty) {
	this.warranty = warranty;
}
@Override
public String toString() {
	return "ElectricCookTop [brand=" + brand + ", weight=" + weight + ", color=" + color + ", customer=" + customer
			+ ", warranty=" + warranty + "]";
}
}
