package com.netsight.app; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.netsight.repository.CustomerRepository;
import com.netsight.repository.HibernateCustomerRepositoryImpl;
import com.netsight.service.java.CustomerServiceJavaConfig;
import com.netsight.service.java.CustomerServiceJavaConfigImpl;


@Configuration
@ComponentScan({"com.netsight"})
public class AppConfig {

	@Bean(name = "customerServiceJavaConfig")
	public CustomerServiceJavaConfig getCustomerServiceJavaConfig() {
		CustomerServiceJavaConfigImpl customerServiceJavaConfig = new CustomerServiceJavaConfigImpl();
		customerServiceJavaConfig.setCustomerRepository(getCustomerRepository());
		
		return customerServiceJavaConfig;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
