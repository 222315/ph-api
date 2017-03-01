/**
 * 
 */
package com.partyhulchul.services.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.partyhulchul.services.api.model.Vendor;

/**
 * @author kottakota
 *
 */
public interface VendorRepo extends MongoRepository<Vendor, String>{
	public Vendor findById(String id);
	public Vendor findByEmailId(String emilId);
	public Vendor findByLastName(String lastName);
	public List<Vendor> findAll();

}
