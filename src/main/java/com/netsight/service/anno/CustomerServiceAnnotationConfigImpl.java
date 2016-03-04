package com.netsight.service.anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsight.model.Customer;
import com.netsight.repository.CustomerRepository;
import com.netsight.service.CustomerService;
import com.netsight.utilities.LogSTS;
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
		LogSTS.log();
	}
	
	@Autowired
	public CustomerServiceAnnotationConfigImpl(CustomerRepository customerRepository){
		LogSTS.log();
		this.customerRepository = customerRepository;
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
