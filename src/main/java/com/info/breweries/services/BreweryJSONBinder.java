package com.info.breweries.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.info.breweries.model.Brewery;

public class BreweryJSONBinder {
//	private static final Logger log = LoggerFactory.getLogger(BreweryJSONBinder.class);

	public List<Brewery> read() throws JsonParseException {
		Logger logger = LoggerFactory.getLogger(getClass());
		// this is the key object to convert JSON to Java
	    ObjectMapper mapper = new ObjectMapper();
	    List<Brewery> breweryList = new ArrayList<>();
	    
	    try {
	    	File json = new ClassPathResource("breweryData.json").getFile();
	    	breweryList = Arrays.asList(mapper.readValue(json, Brewery[].class));
	        return breweryList;
	    } catch(JsonParseException ex) {
	    	logger.error("JsonParseException", ex);
	    } catch (JsonMappingException xe) {
	    	logger.error("JsonMappingException", xe);
		} catch (IOException e) {
			logger.error("IOException", e);
		}
		return breweryList;
	}

}
