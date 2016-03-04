package com.netsight.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netsight.context.ApplicationContextConfig;
import com.netsight.model.Customer;
import com.netsight.service.CustomerService;

@Configuration
@ComponentScan({"com.netsight"})
public class Application {

	public static void main(String[] args) {

		ApplicationContextConfig config = new ApplicationContextConfig();
		
		config.setName("inject with pure xml configuration");
		config.setContext(new ClassPathXmlApplicationContext("com/netsight/app/applicationContext.xml"));
		config.setBeanName("customerService");
		inject(config);

		config.setName("inject with xml annotation configuration");
		config.setContext(new ClassPathXmlApplicationContext("com/netsight/app/applicationContextAnnotationConfig.xml"));
		config.setBeanName("customerServiceJavaConfig");
		inject(config);
		
		
		config.setName("inject with pure Java configuration");
		config.setContext(new AnnotationConfigApplicationContext(Application.class));
		config.setBeanName("customerServiceJavaConfig");
		inject(config);
		


	}


	private static void inject(ApplicationContextConfig config){
		CustomerService service = config.getContext().getBean(config.getBeanName(), CustomerService.class);
		Customer c =  service.findAll().get(0);
		System.out.println(config.getName() + ": " + c.getFirstname()+ " " + c.getLastname());
		System.out.println("\n-----" + config.getName()+ "--- finished ----\n");
	}


}