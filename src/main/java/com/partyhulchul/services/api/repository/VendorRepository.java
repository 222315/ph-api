/**
 * 
 */
package com.partyhulchul.services.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author kottakota
 *
 */
@Repository
public class VendorRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void save(Object objectToSave){
		mongoTemplate.insert(objectToSave);
	}
}
