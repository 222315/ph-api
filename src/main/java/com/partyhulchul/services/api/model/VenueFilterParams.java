package com.partyhulchul.services.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VenueFilterParamters")
public class VenueFilterParams {

	@Id
	private String id;

	private List<String> venueTypes;
	private List<String> capacity;
	private List<String> features;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final List<String> getVenueTypes() {
		return venueTypes;
	}

	public final void setVenueTypes(List<String> venueTypes) {
		this.venueTypes = venueTypes;
	}

	public final List<String> getCapacity() {
		return capacity;
	}

	public final void setCapacity(List<String> capacity) {
		this.capacity = capacity;
	}

	public final List<String> getFeatures() {
		return features;
	}

	public final void setFeatures(List<String> features) {
		this.features = features;
	}

}
