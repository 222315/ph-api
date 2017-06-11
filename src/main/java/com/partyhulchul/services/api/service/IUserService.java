package com.partyhulchul.services.api.service;

import com.partyhulchul.services.api.model.Customer;

public interface IUserService {
	Customer registerNewCustomer(Customer customer);

	Customer getCustomer(String emaiid);

	Customer getUserByID(String id);

	Customer getUserByLastName(String lastName);

	void updateRegisteredCustomer(Customer customer);

	void changeUserPassword(Customer customer, String password);

	void deleteCustomer(Customer customer);

	void createVerificationTokenForCustomer(Customer customer, String token);

	String getVerificationToken(String VerificationToken);

	String generateNewVerificationToken(String token);

	boolean checkIfValidOldPassword(Customer customer, String password);

	String validateVerificationToken(String token);

}