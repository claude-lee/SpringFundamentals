package com.netsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.netsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Hanna");
		customer.setLastname("Hansson");
		
		customers.add(customer);
		
		return customers;
		
	}

}
