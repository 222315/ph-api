package com.party.hulchul.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
* <h1>This class belongs to VendorDetails related information</h1>
*
* @author  Rajesh K
* @version 1.0
* @since   2017-01-30
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "firstName", "lastName", "emailId", "phone", "billingAddress", "postalAddress",
		"notification" })
public class VendorDetails implements Serializable {

	@JsonProperty("id")
	private String id;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("emailId")
	private String emailId;
	@JsonProperty("phone")
	@Valid
	private PhoneDetails phone;
	@JsonProperty("billingAddress")
	@Valid
	private AddressDetails billingAddress;
	@JsonProperty("postalAddress")
	@Valid
	private AddressDetails postalAddress;
	@JsonProperty("notification")
	private String notification;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1198120642480536004L;

	
	public VendorDetails() {
	}

	/**
	 * 
	 * @param id
	 * @param lastName
	 * @param phone
	 * @param emailId
	 * @param notification
	 * @param postalAddress
	 * @param billingAddress
	 * @param firstName
	 */
	public VendorDetails(String id, String firstName, String lastName, String emailId, PhoneDetails phone,
			AddressDetails billingAddress, AddressDetails postalAddress, String notification) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.billingAddress = billingAddress;
		this.postalAddress = postalAddress;
		this.notification = notification;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("emailId")
	public String getEmailId() {
		return emailId;
	}

	@JsonProperty("emailId")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@JsonProperty("phone")
	public PhoneDetails getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(PhoneDetails phone) {
		this.phone = phone;
	}

	@JsonProperty("billingAddress")
	public AddressDetails getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("billingAddress")
	public void setBillingAddress(AddressDetails billingAddress) {
		this.billingAddress = billingAddress;
	}

	@JsonProperty("postalAddress")
	public AddressDetails getPostalAddress() {
		return postalAddress;
	}

	@JsonProperty("postalAddress")
	public void setPostalAddress(AddressDetails postalAddress) {
		this.postalAddress = postalAddress;
	}

	@JsonProperty("notification")
	public String getNotification() {
		return notification;
	}

	@JsonProperty("notification")
	public void setNotification(String notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(firstName).append(lastName).append(emailId).append(phone)
				.append(billingAddress).append(postalAddress).append(notification).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof VendorDetails) == false) {
			return false;
		}
		VendorDetails rhs = ((VendorDetails) other);
		return new EqualsBuilder().append(id, rhs.id).append(firstName, rhs.firstName).append(lastName, rhs.lastName)
				.append(emailId, rhs.emailId).append(phone, rhs.phone).append(billingAddress, rhs.billingAddress)
				.append(postalAddress, rhs.postalAddress).append(notification, rhs.notification)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}