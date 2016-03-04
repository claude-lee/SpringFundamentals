package com.netsight.service.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.service.CustomerService;

@Service("customerServiceJavaConfig")
public class CustomerServiceJavaConfigImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceJavaConfigImpl() {
	}
	
	
	public CustomerServiceJavaConfigImpl(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceJavaConfigImpl: Using Constructor Injection");
		this.customerRepository = customerRepository;
	}

	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceJavaConfigImpl: Using Setter Injection");
		this.customerRepository = customerRepository;
		
	}
	
	public CustomerRepository sgtCustomerRepository() {
		System.out.println("CustomerServiceJavaConfigImpl: Using Getter Injection");
		return customerRepository;
		
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
