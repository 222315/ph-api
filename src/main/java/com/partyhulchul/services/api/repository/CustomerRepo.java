package com.partyhulchul.services.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.partyhulchul.services.api.model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String>{
	public Customer findById(String id);
	public Customer findByEmailId(String emilId);
	public Customer findByLastName(String lastName);
	public List<Customer> findAll();

}
