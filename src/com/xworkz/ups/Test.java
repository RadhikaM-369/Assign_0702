package com.xworkz.ups;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/init.xml");
		UpsInfo upsInfo=context.getBean(UpsInfo.class);
		System.out.println(upsInfo.getCompany());
		System.out.println(upsInfo.getType());
		System.out.println(upsInfo.getWeight());
		System.out.println(upsInfo.getChargeHours());
		System.out.println(upsInfo.getBackupHours());
		System.out.println(upsInfo.getPrice());
		System.out.println(upsInfo.toString());
	}

}
