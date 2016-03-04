package com.netsight.service.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.service.CustomerService;
import com.netsight.utilities.LogSTS;

@Service("customerServiceJavaConfig")
public class CustomerServiceJavaConfigImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceJavaConfigImpl() {
		LogSTS.log();
	}
	
	
	public CustomerServiceJavaConfigImpl(CustomerRepository customerRepository) {
		LogSTS.log();
		this.customerRepository = customerRepository;
	}

	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		LogSTS.log();
		this.customerRepository = customerRepository;
		
	}
	
	public CustomerRepository getCustomerRepository() {
		LogSTS.log();
		return customerRepository;
		
	}

	public List<Customer> findAll() {
		LogSTS.log();
		return customerRepository.findAll();
	}

}
