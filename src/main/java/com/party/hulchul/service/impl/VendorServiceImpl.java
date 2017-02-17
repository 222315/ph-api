package com.party.hulchul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.party.hulchul.dao.VendorRepository;
import com.party.hulchul.request.VendorDetails;
import com.party.hulchul.service.VendorService;

/**
* <h1>This class is the implementation class of the service interface.</h1>
*
* @author  Rajesh K
* @version 1.0
* @since   2017-01-21
*/

@Component
public class VendorServiceImpl implements VendorService  {

	@Autowired
	private VendorRepository vendorRepository;
	
	/**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 * 
	 * This method is responsible for creating the VendorDetails
	 * 
	 * @param VendorDetails
	 * @return
	 */
	@Override
	public VendorDetails create(VendorDetails vendorDetails) {
		vendorRepository.save(vendorDetails);
		return null;
	}

	/**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 *  
	 * This method is responsible for deleting the VendorDetails
	 * @param id
	 * @return
	 */
	@Override
	public boolean delete(String id) {
		vendorRepository.delete(id);
		
		return true;
	}

    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 * 
	 * This method is responsible for find all VendorDetails
     * @return
     */
	@Override
	public List<VendorDetails> findAll() {
		// TODO needs to be implement
		return null;
	}

    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 * 
	 * This method is responsible for find specific VendorDetails
     * @param id
     * @return
     */
	@Override
	public VendorDetails findById(String id) {
		vendorRepository.findOne(id);
		return null;
	}

    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 *
	 * This method is responsible for update the VendorDetails
     * @param VendorDetails
     * @return
     */
	@Override
	public VendorDetails update(VendorDetails vendorDetails) {
		vendorRepository.save(vendorDetails);
		return null;
	}

}
