/**
 * 
 */
package com.partyhulchul.services.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyhulchul.services.api.model.Vendor;
import com.partyhulchul.services.api.repository.VendorRepo;

/**
 * @author kottakota
 *
 */
@RestController
@RequestMapping(value="/vendor/v1")
public class VendorRestController {

	@Autowired
	private VendorRepo vendorRepo;
	
	@RequestMapping(value="/getVendor/{emaiid}")
	public Vendor getVendor(@PathVariable String emaiid){
		
		return vendorRepo.findByEmailId(emaiid);
		
	}
}
