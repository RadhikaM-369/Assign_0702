package com.xworkz.solar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSolar {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/init.xml");
		SolarInfo solar=context.getBean(SolarInfo.class);
		System.out.println(solar.getBrand());
		System.out.println(solar.getCapacity());
		System.out.println(solar.getPrice());
		System.out.println(solar.isColdWater());
				
	}
}
