package com.info.breweries.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.info.breweries.model.Brewery;

@Service
public class BreweryServiceImpl implements BreweryService {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public List<Brewery> findAllBreweries() {
		List<Brewery> breweryList = new ArrayList<>();
		BreweryJSONBinder breweryListJSON = new BreweryJSONBinder();
		try {
			breweryList = breweryListJSON.read();
			logger.info("All Brewery List:");
			logger.info(breweryList.toString());
			return breweryList;
		} catch (JsonParseException e) {
			logger.error("JsonParseException", e);
		}
		return breweryList;
	}

	@Override
	public Brewery findBreweryById(int id) {
		Brewery brewery = new Brewery();
		List<Brewery> breweryList = findAllBreweries();
		try {
			for (Brewery br: breweryList) {
				if (br.getId() == id) {
					return br;
				}
			}
		} catch (NullPointerException e) {
			logger.error("NullPointerException");
			logger.error( "Something's wrong with findAllBreweries()");
		} 
		
		if (brewery.getId() == 0) {
			logger.warn("Please check brewery id. Your provided id is " + id );
		}
		
		return brewery;

	}

}
