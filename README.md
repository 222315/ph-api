# ph-services-api

	API project for PartyHulchul micro services.
	Developed using Spring boot.

## Prerequisites
	JDK 1.8 or later
	Mongo DB
	Docker
	Maven

## Installing steps
+ Clone the repository.
+ Run mvn clean install to load all the required components/plug-ins. Required first time.
+ Run spring-boot:run (if docker is not installed in local system)
+ Run package docker:build (For docker)
+ docker run -p 8080:8080 -t partyhulchul/ph-services-api (For docker)
+ Test with localhost:8080/services


