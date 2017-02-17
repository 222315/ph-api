package com.party.hulchul.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.party.hulchul.dao.AddressRepository;
import com.party.hulchul.dao.CustomerRepository;
import com.party.hulchul.dao.CustomerSearchRepository;
import com.party.hulchul.dao.PhoneRepository;
import com.party.hulchul.model.Address;
import com.party.hulchul.model.Customer;
import com.party.hulchul.request.CustomerDetails;
import com.party.hulchul.service.CustomerDetailsService;

/**
 * <h1>This class is the implementation class of the service interface.</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-21
 */

@Component
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private PhoneRepository phoneRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private CustomerSearchRepository searchRepo;

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for creating the Customer Details
	 * 
	 * @param customerDetails
	 * @return
	 */
	@Override
	public Customer create(CustomerDetails customerDetails) {

		ModelMapper modelMapper = new ModelMapper();
		Customer customer = modelMapper.map(customerDetails, Customer.class);

		List<Address> address = customer.getAddressList();
		address.add(customer.getPostalAddress());
		customer.getBillingAddress().setAddressId(16L);
		address.add(customer.getBillingAddress());
		customer.setAddressList(address);

		addressRepo.save(address);
		phoneRepo.save(customer.getPhone());
		customerRepo.save(customer);
		return null;
	}

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for deleting the Customer Details
	 * @param id
	 * @return
	 */
	@Override
	public boolean delete(Long id) {
		customerRepo.delete(id);

		return true;
	}

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find all Customer Details
	 * @return
	 */
	@Override
	public List<Customer> findAll() {
		// TODO needs to be implement
		return null;
	}

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find specific Customer Details
	 * @param id
	 * @return
	 */
	@Override
	public Customer findById(Long id) {
		customerRepo.findOne(id);
		return null;
	}

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 *
	 *        This method is responsible for update the Customer Details
	 * @param customerDetails
	 * @return
	 */
	@Override
	public Customer update(Customer customer) {
		customerRepo.save(customer);
		return null;
	}

	@Override
	public List<Customer> searchCustomerByCustomString(String searchString) {
		return searchRepo.searchCustomerByCustomString(searchString);
	}

}
