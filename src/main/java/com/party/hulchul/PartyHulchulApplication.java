package com.party.hulchul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@EnableCaching
@ComponentScan("com.party.hulchul")
public class PartyHulchulApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PartyHulchulApplication.class, args);
		System.out.println(ctx.getDisplayName());
	}

}
