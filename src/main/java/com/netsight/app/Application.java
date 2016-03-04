package com.netsight.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netsight.model.Customer;
import com.netsight.service.CustomerService;
import com.netsight.service.anno.CustomerServiceAnnotationConfig;

public class Application {

	public static void main(String[] args) {
		String appContextXml = "com/netsight/app/applicationContext.xml";
		String appContextAnnotationConfig = "com/netsight/app/applicationContextAnnotationConfig.xml";
		
		injectWithXml(appContextXml);
		injectWithAnnotationContext(appContextAnnotationConfig);
		
	}
	
	
	private static void injectWithXml(String appContextFile){
		ApplicationContext appContext = new ClassPathXmlApplicationContext(appContextFile);
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		Customer c =  service.findAll().get(0);
		System.out.println("injectWithXml: " + c.getFirstname()+ " " + c.getLastname());
	}
	
	private static void injectWithAnnotationContext(String appContextFile){
		ApplicationContext appContext = new ClassPathXmlApplicationContext(appContextFile);
		CustomerServiceAnnotationConfig service = appContext.getBean("customerServiceAnnotationConfig", CustomerServiceAnnotationConfig.class);
		Customer c =  service.findAll().get(0);
		System.out.println("injectWithAnnotationContext: " + c.getFirstname()+ " " + c.getLastname());
	}

}