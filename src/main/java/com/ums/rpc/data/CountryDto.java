package com.ums.rpc.data;

import java.io.Serializable;

public class CountryDto implements Serializable {
	private static final long serialVersionUID = -4877391416833069028L;
	private String code;
	private String name;
	
	public CountryDto(String code) {
		this.code = code;
	}
	
	public CountryDto(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
