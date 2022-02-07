package com.xworkz.cookTop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestElectricCookTop {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/init.xml");
		ElectricCookTop cookTop=context.getBean(ElectricCookTop.class);
		System.out.println(cookTop.getBrand());
		System.out.println(cookTop.getColor());
		System.out.println(cookTop.getWeight());
		System.out.println(cookTop.getCustomer());
		System.out.println(cookTop.getWarranty());
		System.out.println(cookTop.toString());
	}

}
