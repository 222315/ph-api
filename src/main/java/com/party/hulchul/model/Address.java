package com.party.hulchul.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <h1>Model Object that represents the ADDRESS collection</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

@Document(collection = "ADDRESS")
public class Address {

	@Id
	@Field
	private Long addressId=11L;
	@Field
	private String addressType;
	@Field
	private String addressLine1;
	@Field
	private String addressLine2;
	@Field
	private String addressLine3;
	@Field
	private String zip;
	@Field
	private String city;
	@Field
	private String state;
	@Field
	private String country;

	public Address() {
	}

	@PersistenceConstructor
	public Address(Long addressId, String addressType, String addressLine1, String addressLine2, String addressLine3,
			String zip, String city, String state, String country) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", zip=" + zip + ", city="
				+ city + ", state=" + state + ", country=" + country + "]";
	}

}
