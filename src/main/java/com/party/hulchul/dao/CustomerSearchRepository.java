package com.party.hulchul.dao;

import java.util.List;

import com.party.hulchul.model.Customer;

/**
* <h1>The responsibility of this interface is to provide a common
* facade for all the custom CRUD operations related to Customer Details.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-28
*/

public interface CustomerSearchRepository {

    /**
     * @param searchString
     * @return
     */
    List<Customer> searchCustomerByCustomString(String searchString);
    
    
	
}
