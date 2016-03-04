package com.netsight.service.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;

public class CustomerServiceJavaConfigImpl implements CustomerServiceJavaConfig {
	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceJavaConfigImpl() {
	}
	
	@Autowired
	public CustomerServiceJavaConfigImpl(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceJavaConfigImpl: Using Constructor Injection");
		this.customerRepository = customerRepository;
	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
