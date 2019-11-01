package com.ums.rpc.data;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class UserSubscriptionDto implements Serializable {
	private static final long serialVersionUID = -3366377122680457469L;
	private Long id;
	private String name;
	private ZonedDateTime expireDate;
	private Integer tier;
	
	public UserSubscriptionDto() {
	}
	
	public UserSubscriptionDto(Long id, String name, ZonedDateTime expireDate, Integer tier) {
		this.id = id;
		this.name = name;
		this.expireDate = expireDate;
		this.tier = tier;
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
	
	public ZonedDateTime getExpireDate() {
		return expireDate;
	}
	
	public void setExpireDate(ZonedDateTime expireDate) {
		this.expireDate = expireDate;
	}
	
	public Integer getTier() {
		return tier;
	}
	
	public void setTier(Integer tier) {
		this.tier = tier;
	}
}
