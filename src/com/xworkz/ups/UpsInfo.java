package com.xworkz.ups;

public class UpsInfo {
private String company;
private String type;
private double weight;
private double backupHours;
private double chargeHours;
private double price;

public UpsInfo() {
	System.out.println("Invoked Ups constructor");
}

public UpsInfo(String company, String type, double weight, double backupHours, double chargeHours, double price) {
	super();
	this.company = company;
	this.type = type;
	this.weight = weight;
	this.backupHours = backupHours;
	this.chargeHours = chargeHours;
	this.price = price;
}

public void setCompany(String company) {
	this.company = company;
}
public void setType(String type) {
	this.type = type;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public void setBackupHours(double backupHours) {
	this.backupHours = backupHours;
}
public void setChargeHours(double chargeHours) {
	this.chargeHours = chargeHours;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCompany() {
	return company;
}
public String getType() {
	return type;
}
public double getWeight() {
	return weight;
}
public double getPrice() {
	return price;
}
public double getChargeHours() {
	return chargeHours;
}
public double getBackupHours() {
	return backupHours;
}

@Override
public String toString() {
	return "UpsInfo [company=" + company + ", type=" + type + ", weight=" + weight + ", backupHours=" + backupHours
			+ ", chargeHours=" + chargeHours + ", price=" + price + "]";
}

}
