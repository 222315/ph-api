package com.party.hulchul.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <h1>Model Object that represents the CUSTOMER collection</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

@Document(collection = "CUSTOMER")
public class Customer {

	@Id
	@Field
	private Long customerId;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String emailId;

	@Transient
	private Address postalAddress;
	@Transient
	private Address billingAddress;

	@DBRef(db = "ADDRESS")
	private List<Address> addressList = new ArrayList<Address>();

	@DBRef(db = "PHONE")
	private Phone phone;

	@Field
	private String notification;

	public Customer() {
	}

	@PersistenceConstructor
	public Customer(Long customerId, String firstName, String lastName, String emailId, List<Address> addressList,
			Phone phone, String notification) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.addressList = addressList;
		this.phone = phone;
		this.notification = notification;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getNotification() {
		return notification;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public Address getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", postalAddress=" + postalAddress + ", billingAddress=" + billingAddress
				+ ", addressList=" + addressList + ", phone=" + phone + ", notification=" + notification + "]";
	}

}
