package com.netsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.utilities.LogSTS;

public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(){
		LogSTS.log();
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		LogSTS.log();
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		LogSTS.log();
		return customerRepository.findAll();
	}

}
