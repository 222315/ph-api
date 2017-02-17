package com.party.hulchul.service;

import java.util.List;

import com.party.hulchul.model.Customer;
import com.party.hulchul.request.CustomerDetails;

/**
 * <h1>The responsibility of this interface is to provide a common facade for
 * all the CRUD operations related to Customer Details.</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-21
 */

public interface CustomerDetailsService {

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for creating the Customer Details
	 * 
	 * @param customerDetails
	 * @return
	 */
	Customer create(CustomerDetails customerDetails);

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for deleting the Customer Details
	 * @param id
	 * @return
	 */
	boolean delete(Long id);

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find all Customer Details
	 * @return
	 */
	List<Customer> findAll();

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find specific Customer Details
	 * @param id
	 * @return
	 */
	Customer findById(Long id);

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 *
	 *        This method is responsible for update the Customer Details
	 * @param customerDetails
	 * @return
	 */
	Customer update(Customer customer);

	/**
	 * @author Soumya
	 * @since 2017-01-28
	 * 
	 * @param searchString
	 * @return
	 */
	List<Customer> searchCustomerByCustomString(String searchString);

	

}
