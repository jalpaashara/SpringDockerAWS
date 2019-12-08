package com.info.breweries.services;

import java.util.List;

import com.info.breweries.model.*;


public interface BreweryService {
	public List<Brewery> findAllBreweries();
	public Brewery findBreweryById(int id);
}
