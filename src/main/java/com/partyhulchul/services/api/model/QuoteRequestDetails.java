package com.partyhulchul.services.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "QuoteRequests")
public class QuoteRequestDetails {

	@Id
	private String id;

	private String eventType;
	private String totalBudget;
	private List<String> serviceItems;
	private List<String> entertainmentItems;
	private boolean eventPlannerNeeded;
	private String city;
	private String location;
	private String date;
	private String expectedGuestCount;
	private String name;
	private String email;
	private String contactNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(String totalBudget) {
		this.totalBudget = totalBudget;
	}

	public List<String> getServiceItems() {
		return serviceItems;
	}

	public void setServiceItems(List<String> serviceItems) {
		this.serviceItems = serviceItems;
	}

	public List<String> getEntertainmentItems() {
		return entertainmentItems;
	}

	public void setEntertainmentItems(List<String> entertainmentItems) {
		this.entertainmentItems = entertainmentItems;
	}

	public boolean isEventPlannerNeeded() {
		return eventPlannerNeeded;
	}

	public void setEventPlannerNeeded(boolean eventPlannerNeeded) {
		this.eventPlannerNeeded = eventPlannerNeeded;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getExpectedGuestCount() {
		return expectedGuestCount;
	}

	public void setExpectedGuestCount(String expectedGuestCount) {
		this.expectedGuestCount = expectedGuestCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
