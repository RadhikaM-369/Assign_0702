package com.xworkz.solar;

public class SolarInfo {
private int capacity;
private String brand;
private int price;
private boolean coldWater;

public SolarInfo() {
	System.out.println("Invoked constructor with no arguments");
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isColdWater() {
	return coldWater;
}
public void setColdWater(boolean coldWater) {
	this.coldWater = coldWater;
}
@Override
public String toString() {
	return "SolarInfo [capacity=" + capacity + ", brand=" + brand + ", price=" + price + ", coldWater=" + coldWater
			+ "]";
}


}
