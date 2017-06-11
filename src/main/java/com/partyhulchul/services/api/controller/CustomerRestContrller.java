package com.partyhulchul.services.api.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyhulchul.services.api.model.Customer;
import com.partyhulchul.services.api.repository.CustomerRepo;

@RestController
@RequestMapping(value = "/customer")
public class CustomerRestContrller {
	
	 private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
    private JavaMailSender mailSender;

	@RequestMapping(value = "/getCustomer/{emaiid}")
	public Customer getCustomer(@PathVariable String emaiid) {

		return customerRepo.findByEmailId(emaiid);

	}
	
	@RequestMapping(value = "/registerNewCustomer/{emaiid}")
	public ResponseEntity<?> registerNewCustomer(@PathVariable Customer customer) throws Exception {
		LOGGER.debug("Registering user customer with information:", customer);
		if (emailExist(customer.getEmailId())) {
			return new ResponseEntity<String>("There is an account with that email adress: " + customer.getEmailId(), HttpStatus.BAD_REQUEST);
        }
        final String token = UUID.randomUUID().toString();
        createVerificationTokenForUser(customer, token);

        final SimpleMailMessage email = constructEmailMessage( customer, token);
        mailSender.send(email);
		customerRepo.save(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

	}

	
	/**
	 * @param customer
	 * @param token
	 */
	private void createVerificationTokenForUser(Customer customer, String token) {
		// TODO Auto-generated method stub
		
	}

	private boolean emailExist(final String email) {
		final Customer customer = customerRepo.findByEmailId(email);
		if (customer != null) {
			return true;
		}
		return false;
	}
	
    private final SimpleMailMessage constructEmailMessage(final Customer customer, final String token) {
        final String recipientAddress = customer.getEmailId();
        final String subject = "Registration Confirmation";
        final String confirmationUrl = "http://localhost:8080/" + "/registrationConfirm?token=" + token;
        final String message = "Thank you for registering, Please click on confirmation url to verify your email" ;
        final SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message + " \r\n" + confirmationUrl);
        //todo get mail id 
        email.setFrom("testadminmail@email.com");
        return email;
    }

}
