/**
 * 
 */
package com.party.hulchul.controller;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.dao.CustomerRepository;
import com.party.hulchul.model.Customer;
import com.party.hulchul.model.Vendor;
import com.party.hulchul.request.CustomerDetails;
import com.party.hulchul.request.VendorDetails;
import com.party.hulchul.service.CustomerDetailsService;
import com.party.hulchul.util.JsonParserUtil;

/**
 * @author RKottak
 *
 */
@RequestMapping("/customer/v1")
@RestController
public class CustomerDetailsController {
	@Autowired
	CustomerDetailsService service;
	

	@Autowired
	private CustomerRepository repo;
	
	

	/*@RequestMapping(value = "/getCustomer", method = RequestMethod.GET, params = { "customerId" })
	@Consumes("application/json")
	public CustomerDetails getCustomerDetails(@RequestParam(value = "customerId") String customerId) {
		return service.findById(customerId);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET, params = { "customerId" })
	@Consumes("application/json")
	public boolean deleteCustomerDetails(@RequestParam(value = "customerId") String customerId) {
		return service.delete(customerId);
	}*/

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 * @param todoEntry
	 * @return
	 */
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	@Consumes("application/json")
	Customer createCustomerDetails(@RequestBody @Valid CustomerDetails customerDetails) {
		return service.create(customerDetails);
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody String searchCustomerDetails(@RequestParam(value = "search") String search, HttpServletRequest request) {
		System.out.println("Person Record with name Hektor  is "+repo.searchByFirstName("Soumya"));
		return JsonParserUtil.toString(service.searchCustomerByCustomString(search));
		
	}

	@RequestMapping(value = "/vendors", method = RequestMethod.GET)
	public String getAllVendorDetails() {
		System.out.println("This is calling from the Angular2");
		
		List<VendorDetails> allVendors = new ArrayList<VendorDetails>();
		VendorDetails vendor1 = new VendorDetails();
		vendor1.setId("1");
		vendor1.setEmailId("test1@test.com");
		vendor1.setFirstName("first name1");
		vendor1.setLastName("last name1");
		
		VendorDetails vendor2 = new VendorDetails();
		vendor2.setId("2");
		vendor2.setEmailId("test2@test.com");
		vendor2.setFirstName("first name2");
		vendor2.setLastName("last name12");
		
		VendorDetails vendor3 = new VendorDetails();
		vendor3.setId("3");
		vendor3.setEmailId("test3@test.com");
		vendor3.setFirstName("first name3");
		vendor3.setLastName("last name13");
		
		allVendors.add(vendor1);
		allVendors.add(vendor2);
		allVendors.add(vendor3);
		
		
		return JsonParserUtil.toString(allVendors);
		/*return JsonParserUtil.toString(Json.createArrayBuilder()
				.add(duke("Soumya",25))
				.add(duke("Rajesh",22)).build());*/
		
	}
	public JsonObject duke(String name, int age)
	{
		return Json.createObjectBuilder().
				add("name", name).
				add("age", age).build();
	}
	/*@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	@Consumes("application/json")
	CustomerDetails updateCustomer(@RequestBody @Valid CustomerDetails todoEntry) {
		return service.update(todoEntry);
	}*/
	
	 
	
	
}
