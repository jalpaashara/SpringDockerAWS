package com.info.breweries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.breweries.model.Brewery;
import com.info.breweries.services.BreweryService;

@RestController
public class BreweriesController {
	@Autowired
	BreweryService breweryService;
	
	
	/**
	 * Get all Breweries
	 * @author Jalpa Ashara
	 * @return list
	 */
	@RequestMapping("/")
	public List<Brewery> getAllBreweries(){
		List<Brewery> breweries = breweryService.findAllBreweries();
		return breweries;
	}
	
	@GetMapping(value="/{id}")
	public Brewery getBreweryById(@PathVariable int id) {
		return breweryService.findBreweryById(id);
	}
	

}
