package com.netsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(){
		System.out.println("CustomerServiceImpl: Using Constructor Injection");
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceImpl: Using Setter Injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
