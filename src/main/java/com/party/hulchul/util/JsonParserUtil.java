package com.party.hulchul.util;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <h1>This is the utility static class for all the JSON related utility
 * methods</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

public class JsonParserUtil {

	static final Logger logger = LoggerFactory.getLogger(JsonParserUtil.class);

	public static <T> Object toObject(String jsonString, Class<T> jsonClass) {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		try {
			mapper.setSerializationInclusion(Include.NON_EMPTY);
			object = mapper.readValue(jsonString, jsonClass);

		} catch (JsonGenerationException jge) {
			logger.error("Error occoured in the JsonParserUtil class", jge);
		} catch (JsonMappingException jme) {
			logger.error("Error occoured in the JsonParserUtil class", jme);
		} catch (IOException ioe) {
			logger.error("Error occoured in the JsonParserUtil class", ioe);
		} catch (Exception ex) {
			logger.error("Error occoured in the JsonParserUtil class", ex);
		}
		return object;

	}

	public static <T> Object toObject(File jsonFile, Class<T> jsonClass) {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		try {
			mapper.setSerializationInclusion(Include.NON_EMPTY);
			object = mapper.readValue(jsonFile, jsonClass);

		} catch (JsonGenerationException jge) {
			logger.error("Error occoured in the JsonParserUtil class", jge);
		} catch (JsonMappingException jme) {
			logger.error("Error occoured in the JsonParserUtil class", jme);
		} catch (IOException ioe) {
			logger.error("Error occoured in the JsonParserUtil class", ioe);
		} catch (Exception ex) {
			logger.error("Error occoured in the JsonParserUtil class", ex);
		}
		return object;

	}

	public static String toString(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = null;
		try {
			mapper.setSerializationInclusion(Include.NON_EMPTY);
			jsonString = mapper.writeValueAsString(object);
		} catch (JsonGenerationException jge) {
			logger.error("Error occoured in the JsonParserUtil class", jge);
		} catch (JsonMappingException jme) {
			logger.error("Error occoured in the JsonParserUtil class", jme);
		} catch (IOException ioe) {
			logger.error("Error occoured in the JsonParserUtil class", ioe);
		} catch (Exception ex) {
			logger.error("Error occoured in the JsonParserUtil class", ex);
		}
		return jsonString;
	}

}
