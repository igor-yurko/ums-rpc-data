package com.ums.rpc.data;

import java.io.Serializable;

public class BusinessAddressDto extends AbstractAddressDto implements Serializable {
	private static final long serialVersionUID = -3832899796448188896L;
	private String companyName;
	private String taxNumber;
	
	public BusinessAddressDto(Long id, CountryDto country, String state, String city, String zipCode, String addressLine1,
							  String addressLine2, String companyName, String taxNumber) {
		super(id, country, state, city, zipCode, addressLine1, addressLine2, AddressType.BUSINESS);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}
	
	public BusinessAddressDto() {
		setType(AddressType.BUSINESS);
	}
	
	public BusinessAddressDto(String companyName, String taxNumber) {
		this.companyName = companyName;
		this.taxNumber = taxNumber;
		setType(AddressType.BUSINESS);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getTaxNumber() {
		return taxNumber;
	}
	
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
