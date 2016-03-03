package com.netsight.repository;

import java.util.List;

import com.netsight.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}