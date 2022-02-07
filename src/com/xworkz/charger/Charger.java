package com.xworkz.charger;

public class Charger {
	private String brand;
	private int price;
	private String color;
	private int volt;
	private boolean working;

	public Charger() {
		
	}

	public Charger(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("invoke parameter : " + brand);
		System.out.println("invoke parameter : " + price);
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", price=" + price + ", color=" + color + ", volt=" + volt + ", isWorking="
				+ working + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean isWorking) {
		this.working = isWorking;

	}

}
