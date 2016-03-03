package com.netsight.service;

import java.util.List;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
