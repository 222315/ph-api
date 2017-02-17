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
* <h1>This class belongs to Phone related information</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "mobile", "home", "other" })
public class PhoneDetails implements Serializable {

	@JsonProperty("mobile")
	private String mobile;
	@JsonProperty("home")
	private String home;
	@JsonProperty("other")
	private String other;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 6108658458171514104L;

	/**
	 * No args constructor for use in serialization
	 * 
	 * @author Soumya
	 * @version 1.0
	 * @since 2017-01-21
	 * 
	 */
	public PhoneDetails() {
	}

	/**
	 * 
	 * @param home
	 * @param other
	 * @param mobile
	 */
	public PhoneDetails(String mobile, String home, String other) {
		super();
		this.mobile = mobile;
		this.home = home;
		this.other = other;
	}

	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonProperty("mobile")
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("home")
	public String getHome() {
		return home;
	}

	@JsonProperty("home")
	public void setHome(String home) {
		this.home = home;
	}

	@JsonProperty("other")
	public String getOther() {
		return other;
	}

	@JsonProperty("other")
	public void setOther(String other) {
		this.other = other;
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
		return new HashCodeBuilder().append(mobile).append(home).append(other).append(additionalProperties)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PhoneDetails) == false) {
			return false;
		}
		PhoneDetails rhs = ((PhoneDetails) other);
		return new EqualsBuilder().append(mobile, rhs.mobile).append(home, rhs.home).append(other, rhs.other)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}