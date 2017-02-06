package com.partyhulchul.services.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.partyhulchul.services.api.model.Locations;
import com.partyhulchul.services.api.model.QuoteRequestDetails;
import com.partyhulchul.services.api.model.VenueDetails;
import com.partyhulchul.services.api.model.VenueFilterParams;
import com.partyhulchul.services.api.repository.CustomRepository;
import com.partyhulchul.services.api.repository.LocationsRepository;
import com.partyhulchul.services.api.repository.VenuesRepository;
import com.partyhulchul.services.api.util.EmailSender;

@RestController
@RequestMapping(
		path = "/",
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE,
		method = { RequestMethod.GET, RequestMethod.POST })

public class EventPortalController {

	@Autowired
	private LocationsRepository locationsRepository;

	@Autowired
	private VenuesRepository venuesRepository;
	
	@Autowired
	private CustomRepository customRepository;
	
	@Autowired
	private EmailSender emailSender;
	
	@RequestMapping(value = "/getLocations", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Locations>> getLocations() {
		List<Locations> locations = (List<Locations>) locationsRepository.findAll();
		return new ResponseEntity<List<Locations>>(locations, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getVenues", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<VenueDetails>> getVenues(@RequestParam("searchString") String text) {
		List<VenueDetails> venues = (List<VenueDetails>) venuesRepository.searchVenues(text);
		return new ResponseEntity<List<VenueDetails>>(venues, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getVenueFilterParams", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<VenueFilterParams>> getVenueFilterParams() {
		List<VenueFilterParams> venuesFilterParams = (List<VenueFilterParams>) venuesRepository.getVenueFilterDetails();
		return new ResponseEntity<List<VenueFilterParams>>(venuesFilterParams, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/postQuoteRequest", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> postQuoteRequest(@RequestBody QuoteRequestDetails quoteRequestDetails) {
		customRepository.save(quoteRequestDetails);
		emailSender.send();
		return null;
	}
	

}
