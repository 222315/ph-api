/**
 * 
 */
package com.party.hulchul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RKottak
 *
 */
@RestController
public class PartyHulchulController {

	 @RequestMapping("/sample")
     public String sampleIt(){
         return "Hello! Welcome to Spring Boot Sample. ";
	     }

}
