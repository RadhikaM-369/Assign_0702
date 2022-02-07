package com.xworkz.toothPaste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("resources/init.xml");
		ToothPaste toothpaste=context.getBean(ToothPaste.class);
		System.out.println(toothpaste.getCompany());
		System.out.println(toothpaste.getMl());
		System.out.println(toothpaste.getPrice());
		System.out.println(toothpaste.isOffer());
		System.out.println(toothpaste.isSalt());
		System.out.println(toothpaste.getBrandAmbassador());
		System.out.println(toothpaste.toString());
	}

}
