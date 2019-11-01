package com.ums.rpc.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreditedAccrualDto implements Serializable {
	private static final long serialVersionUID = 3696326770102056283L;
	private String userUUID;
	private String accrualId;
	private BigDecimal accrualAmount;
	private String accrualCurrency;
	private Long orderItemId;
	private String name;
	private String description;
	private String productApiKey;
	
	public CreditedAccrualDto() {}
	
	public CreditedAccrualDto(String userUUID, String accrualId, BigDecimal accrualAmount, String accrualCurrency, Long orderItemId, String name,
							  String description, String productApiKey) {
		this.userUUID = userUUID;
		this.accrualId = accrualId;
		this.accrualAmount = accrualAmount;
		this.accrualCurrency = accrualCurrency;
		this.orderItemId = orderItemId;
		this.name = name;
		this.description = description;
		this.productApiKey = productApiKey;
	}
	
	public String getUserUUID() {
		return userUUID;
	}
	
	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}
	
	public String getAccrualId() {
		return accrualId;
	}
	
	public void setAccrualId(String accrualId) {
		this.accrualId = accrualId;
	}
	
	public BigDecimal getAccrualAmount() {
		return accrualAmount;
	}
	
	public void setAccrualAmount(BigDecimal accrualAmount) {
		this.accrualAmount = accrualAmount;
	}
	
	public String getAccrualCurrency() {
		return accrualCurrency;
	}
	
	public void setAccrualCurrency(String accrualCurrency) {
		this.accrualCurrency = accrualCurrency;
	}
	
	public Long getOrderItemId() {
		return orderItemId;
	}
	
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getProductApiKey() {
		return productApiKey;
	}
	
	public void setProductApiKey(String productApiKey) {
		this.productApiKey = productApiKey;
	}
}
