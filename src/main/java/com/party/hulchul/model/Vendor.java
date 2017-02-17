package com.party.hulchul.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <h1>DTO or Value Object that represents the vendorDetails collection</h1>
 *
 * @author Rajesh K
 * @version 1.0
 * @since 2017-01-30
 */

@Document(collection = "vendorDetails")
public class Vendor {

	@Id
	private String vendorId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phone;
	private String billingAddress;
	private String postalAddress;
	private String notification;

	@PersistenceConstructor
	public Vendor(String vendorId, String firstName, String lastName, String emailId, String phone,
			String billingAddress, String postalAddress, String notification) {
		super();
		this.vendorId = vendorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.billingAddress = billingAddress;
		this.postalAddress = postalAddress;
		this.notification = notification;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "Vendor [VendorId=" + vendorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", phone=" + phone + ", billingAddress=" + billingAddress
				+ ", postalAddress=" + postalAddress + ", notification=" + notification + "]";
	}

}
