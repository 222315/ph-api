/**
 * 
 */
package com.party.hulchul.controller;

import javax.validation.Valid;
import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.request.VendorDetails;
import com.party.hulchul.service.VendorService;

/**
 * @author RKottak
 *
 */
@RequestMapping("/v1/vendor")
@RestController
public class VendorController {

	@Autowired
	VendorService service;
	
	@RequestMapping(value = "/createVendor", method = RequestMethod.POST)
	@Consumes("application/json")
	VendorDetails createVendor(@RequestBody @Valid VendorDetails todoEntry) {
		return service.create(todoEntry);
	}
	
	@RequestMapping(value = "/updateVendor", method = RequestMethod.POST)
	@Consumes("application/json")
	VendorDetails updateVendor(@RequestBody @Valid VendorDetails todoEntry) {
		return service.update(todoEntry);
	}
	
	@RequestMapping(value = "/getVendor", method = RequestMethod.GET, params = { "vendorId" })
	@Consumes("application/json")
	public VendorDetails getVendor(@RequestParam(value = "vendorId") String vendorId) {
		return service.findById(vendorId);
	}

	@RequestMapping(value = "/deleteVendor", method = RequestMethod.GET, params = { "vendorId" })
	@Consumes("application/json")
	public boolean deleteVendor(@RequestParam(value = "vendorId") String vendorId) {
		return service.delete(vendorId);
	}

}
