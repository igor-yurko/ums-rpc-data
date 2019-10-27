package com.ums.rpc.data;

import java.io.Serializable;

public class ProductRoleDto implements Serializable {
	private static final long serialVersionUID = -5044177253643782932L;
	private Long id;
	private String name;
	private String product;
	private String base;
	private Boolean registrationAvailable;
	
	public ProductRoleDto() {}
	
	public ProductRoleDto(Long id, String name, String product, String base, Boolean registrationAvailable) {
		this.id = id;
		this.name = name;
		this.product = product;
		this.base = base;
		this.registrationAvailable = registrationAvailable;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	public Boolean getRegistrationAvailable() {
		return registrationAvailable;
	}
	
	public void setRegistrationAvailable(Boolean registrationAvailable) {
		this.registrationAvailable = registrationAvailable;
	}
}
