package com.xworkz.charger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCharger {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/init.xml");
		Charger charger=context.getBean("charger",Charger.class);
		System.out.println(charger.getColor());
		System.out.println(charger.getVolt());
		System.out.println(charger.isWorking());
		
		
	}

}
