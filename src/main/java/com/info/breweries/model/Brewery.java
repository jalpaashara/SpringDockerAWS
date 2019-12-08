package com.info.breweries.model;

import com.info.breweries.model.Address;

public class Brewery {
	private int id;
	private String name;
	private String breweryType;
	private Address address;
	private String phone;
	private String websiteUrl;
	
	public Brewery() {
		super();
	}

	public Brewery(int id, String name, String breweryType, Address address, String phone, String websiteUrl) {
		super();
		this.id = id;
		this.name = name;
		this.breweryType = breweryType;
		this.address = address;
		this.phone = phone;
		this.websiteUrl = websiteUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreweryType() {
		return breweryType;
	}
	public void setBreweryType(String breweryType) {
		this.breweryType = breweryType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	@Override
	public String toString() {
		return "Brewery [id=" + id + ", name=" + name + ", breweryType=" + breweryType + ", address=" + address
				+ ", phone=" + phone + ", websiteUrl=" + websiteUrl + "]";
	}
}
