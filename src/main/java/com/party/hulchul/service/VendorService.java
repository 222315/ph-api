package com.party.hulchul.service;

import java.util.List;

import com.party.hulchul.request.VendorDetails;

/**
 * <h1>The responsibility of this interface is to provide a common facade for
 * all the CRUD operations related to Vendor Details.</h1>
 *
 * @author Rajesh K
 * @version 1.0
 * @since 2017-01-21
 */

public interface VendorService {

	/**
	 * @author Rajesh K
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for creating the VendorDetails
	 * 
	 * @param VendorDetails
	 * @return
	 */
	VendorDetails create(VendorDetails vendorDetails);

	/**
	 * @author Rajesh K
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for deleting the Vendor Details
	 * @param id
	 * @return
	 */
	boolean delete(String id);

	/**
	 * @author Rajesh K
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find all Vendor Details
	 * @return
	 */
	List<VendorDetails> findAll();

	/**
	 * @author Rajesh K
	 * @since 2017-01-22
	 * 
	 *        This method is responsible for find specific Vendor Details
	 * @param id
	 * @return
	 */
	VendorDetails findById(String id);

	/**
	 * @author Rajesh K
	 * @since 2017-01-22
	 *
	 *        This method is responsible for update the Vendor Details
	 * @param VendorDetails
	 * @return
	 */
	VendorDetails update(VendorDetails vendorDetails);

}
