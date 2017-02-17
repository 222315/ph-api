package com.party.hulchul.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <h1>Model Object that represents the PHONE collection</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

@Document(collection = "PHONE")
public class Phone {

	@Id
	@Field
	private Long phoneId=12L;

	@Field
	private Long mobile;

	@Field
	private Long home;

	@Field
	private Long other;

	public Phone() {
	}

	@PersistenceConstructor
	public Phone(Long phoneId, Long mobile, Long home, Long other) {
		super();
		this.phoneId = phoneId;
		this.mobile = mobile;
		this.home = home;
		this.other = other;
	}

	public Long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Long getHome() {
		return home;
	}

	public void setHome(Long home) {
		this.home = home;
	}

	public Long getOther() {
		return other;
	}

	public void setOther(Long other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", mobile=" + mobile + ", home=" + home + ", other=" + other + "]";
	}

}
