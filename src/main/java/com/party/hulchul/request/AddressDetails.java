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
* <h1>This class belongs to Billing Address related information</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "addressType", "addressLine1", "addressLine2", "addressLine3", "zip", "city", "state", "country" })
public class AddressDetails implements Serializable {

	@JsonProperty("addressType")
	private String addressType;
	@JsonProperty("addressLine1")
	private String addressLine1;
	@JsonProperty("addressLine2")
	private String addressLine2;
	@JsonProperty("addressLine3")
	private String addressLine3;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("country")
	private String country;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8122447667292947903L;

	/**
	 * No args constructor for use in serialization
	 * 
	 * @author Soumya
	 * @version 1.0
	 * @since 2017-01-21
	 * 
	 */
	public AddressDetails() {
	}

	/**
	 * @author Soumya
	 * @version 1.0
	 * @since 2017-01-21
	 * 
	 * @param zip
	 * @param state
	 * @param addressLine3
	 * @param addressLine2
	 * @param addressLine1
	 * @param country
	 * @param city
	 */
	public AddressDetails(String addressType, String addressLine1, String addressLine2, String addressLine3, String zip, String city,
			String state, String country) {
		super();
		this.addressType = addressType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@JsonProperty("addressType")
	public String getAddressType() {
		return addressType;
	}

	@JsonProperty("addressType")
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	@JsonProperty("addressLine1")
	public String getAddressLine1() {
		return addressLine1;
	}

	@JsonProperty("addressLine1")
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@JsonProperty("addressLine2")
	public String getAddressLine2() {
		return addressLine2;
	}

	@JsonProperty("addressLine2")
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@JsonProperty("addressLine3")
	public String getAddressLine3() {
		return addressLine3;
	}

	@JsonProperty("addressLine3")
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(String zip) {
		this.zip = zip;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
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
		return new HashCodeBuilder().append(addressType).append(addressLine1).append(addressLine2).append(addressLine3).append(zip)
				.append(city).append(state).append(country).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof AddressDetails) == false) {
			return false;
		}
		AddressDetails rhs = ((AddressDetails) other);
		return new EqualsBuilder().append(addressType, rhs.addressType).append(addressLine1, rhs.addressLine1).append(addressLine2, rhs.addressLine2)
				.append(addressLine3, rhs.addressLine3).append(zip, rhs.zip).append(city, rhs.city)
				.append(state, rhs.state).append(country, rhs.country)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}