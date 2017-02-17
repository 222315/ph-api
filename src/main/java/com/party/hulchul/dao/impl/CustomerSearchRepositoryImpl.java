package com.party.hulchul.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.party.hulchul.dao.CustomerSearchRepository;
import com.party.hulchul.model.Customer;

/**
* <h1>The responsibility of this class is to 
* provide a unified implementation for the custom operations related to the Customer</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-28
*/

@Repository
public class CustomerSearchRepositoryImpl implements CustomerSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Customer> searchCustomerByCustomString(String searchString) {
		
		return mongoTemplate.find(Query.query(new Criteria().
									orOperator(Criteria.where("firstName").regex(searchString,"i"),
												Criteria.where("lastName").regex(searchString, "i"),
												Criteria.where("emailId").regex(searchString, "i"))
									), Customer.class);
		
		
	}

}
