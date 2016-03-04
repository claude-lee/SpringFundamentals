package com.netsight.service.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.service.CustomerService;
/**
 * 
 * @author clei
 * @Autowired this annotation can be used in three different levels
 * - on member level
 * - on constructor level
 * - on setter level
 *
 */
@Service("customerServiceAnnotationConfig")
public class CustomerServiceAnnotationConfigImpl implements CustomerService {
	
	
	
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceAnnotationConfigImpl(){
		
	}
	
	@Autowired
	public CustomerServiceAnnotationConfigImpl(CustomerRepository customerRepository){
		System.out.println("CustomerServiceAnnotationConfigImpl: Using Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceAnnotationConfigImpl: Using Setter Injection");
		this.customerRepository = customerRepository;
	}


	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
