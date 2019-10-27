package com.ums.rpc.data;

import java.io.Serializable;

public abstract class AbstractAddressDto implements Serializable {
	private Long id;
	private CountryDto country;
	private String state;
	private String city;
	private String zipCode;
	private String addressLine1;
	private String addressLine2;
	private AddressType type;
	
	public AbstractAddressDto() {
	}
	
	public AbstractAddressDto(Long id, CountryDto country, String state, String city, String zipCode, String addressLine1,
							  String addressLine2, AddressType type) {
		this.id = id;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public CountryDto getCountry() {
		return country;
	}
	
	public void setCountry(CountryDto country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public AddressType getType() {
		return type;
	}
	
	public void setType(AddressType type) {
		this.type = type;
	}
}
