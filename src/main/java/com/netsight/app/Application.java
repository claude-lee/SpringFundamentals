package com.netsight.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/netsight/app/applicationContext.xml");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}