package com.netsight;

import com.netsight.service.CustomerService;
import com.netsight.service.CustomerServiceImpl;


public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}