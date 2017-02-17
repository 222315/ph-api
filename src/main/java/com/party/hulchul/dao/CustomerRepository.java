package com.party.hulchul.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.party.hulchul.model.Customer;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Customer.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/
@org.springframework.stereotype.Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
     * @param deleted
     */
   // boolean delete(String id);
    
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @return
     */
    List<Customer> findAll();
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param id
     * @return
     */
   // Optional<CustomerDetails> findOne(String id);
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param saved
     * @return
     */
    @SuppressWarnings("unchecked")
	Customer save(Customer customer);
    
    @Query("{'firstName' : ?0 }")
    Iterable<Customer> searchByFirstName(String searchName);
    
}
