package com.ums.rpc.data;

import java.io.Serializable;

public class PrivateAddressDto extends AbstractAddressDto implements Serializable {
	private static final long serialVersionUID = -241363618175772180L;
	
	public PrivateAddressDto() {
		setType(AddressType.PRIVATE);
	}
	
	public PrivateAddressDto(Long id, CountryDto country, String state, String city, String zipCode, String addressLine1, String addressLine2) {
		super(id, country, state, city, zipCode, addressLine1, addressLine2, AddressType.PRIVATE);
	}
}
