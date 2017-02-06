package com.partyhulchul.services.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.partyhulchul.services.api.repository")
public class PartyHulchulApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PartyHulchulApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PartyHulchulApiApplication.class).web(true);
	}

}
