package com.xworkz.toothPaste;

public class ToothPaste {
	private String company;
	private int price;
	private boolean offer;
	private double ml;
	private boolean salt;
	private String brandAmbassador;
	
	public ToothPaste() {
		System.out.println("Invoked no parameter constructor");
	}

	public ToothPaste(String company, int price, boolean offer, double ml) {
		super();
		this.company = company;
		this.price = price;
		this.offer = offer;
		this.ml = ml;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isOffer() {
		return offer;
	}
	public void setOffer(boolean offer) {
		this.offer = offer;
	}
	public double getMl() {
		return ml;
	}
	public void setMl(double ml) {
		this.ml = ml;
	}
	public boolean isSalt() {
		return salt;
	}
	public void setSalt(boolean salt) {
		this.salt = salt;
	}
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}

	@Override
	public String toString() {
		return "ToothPaste [company=" + company + ", price=" + price + ", offer=" + offer + ", ml=" + ml + ", salt="
				+ salt + ", brandAmbassador=" + brandAmbassador + "]";
	}
		
}
