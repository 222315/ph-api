package com.party.hulchul.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.party.hulchul.request.VendorDetails;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Customer Details.</h1>
*
* @author  Rajesh K
* @version 1.0
* @since   2017-01-21
*/

public interface VendorRepository extends Repository<VendorDetails, String> {
	
    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
	 * 
     * @param deleted
     */
    boolean delete(String id);
    
    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
     * 
     * @return
     */
    List<VendorDetails> findAll();
 
    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
     * 
     * @param id
     * @return
     */
    Optional<VendorDetails> findOne(String id);
 
    /**
	 * @author  Rajesh K
	 * @since   2017-01-22
     * 
     * @param saved
     * @return
     */
    VendorDetails save(VendorDetails saved);
}
