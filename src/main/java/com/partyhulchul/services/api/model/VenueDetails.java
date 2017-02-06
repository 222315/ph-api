package com.partyhulchul.services.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Venues")
public class VenueDetails {

	@Id
	private String id;

	private String name;
	private String location;
	private String seatingCapacity;
	private String priceStartingFrom;
	private Address address;
	private String contactPerson;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public final String getSeatingCapacity() {
		return seatingCapacity;
	}

	public final void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public final String getPriceStartingFrom() {
		return priceStartingFrom;
	}

	public final void setPriceStartingFrom(String priceStartingFrom) {
		this.priceStartingFrom = priceStartingFrom;
	}

}

class Address {
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String pincode;

	public final String getAddressLine1() {
		return addressLine1;
	}

	public final void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public final String getAddressLine2() {
		return addressLine2;
	}

	public final void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public final String getState() {
		return state;
	}

	public final void setState(String state) {
		this.state = state;
	}

	public final String getPincode() {
		return pincode;
	}

	public final void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
