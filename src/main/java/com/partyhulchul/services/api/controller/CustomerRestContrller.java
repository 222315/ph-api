package com.partyhulchul.services.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyhulchul.services.api.model.Customer;
import com.partyhulchul.services.api.repository.CustomerRepo;


@RestController
@RequestMapping(value="/customer")
public class CustomerRestContrller {
	@Autowired
	private CustomerRepo customer;
	
	@RequestMapping(value="/getCustomer/{emaiid}")
	public Customer getCustomer(@PathVariable String emaiid){
		
		return customer.findByEmailId(emaiid);
		
	}

}
