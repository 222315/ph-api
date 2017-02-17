package com.party.hulchul.dao;

import org.springframework.data.repository.CrudRepository;

import com.party.hulchul.model.Address;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Address.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/
@org.springframework.stereotype.Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
	
 
    
}
