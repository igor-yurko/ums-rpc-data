package com.ums.rpc.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreditedAccrualDto implements Serializable {
	private static final long serialVersionUID = 3696326770102056283L;
	private String userUUID;
	private Long accrualId;
	private BigDecimal accrualAmount;
	private String accrualCurrency;
	private Long orderItemId;
	
	public CreditedAccrualDto() {}
	
	public CreditedAccrualDto(String userUUID, Long accrualId, BigDecimal accrualAmount, String accrualCurrency, Long orderItemId) {
		this.userUUID = userUUID;
		this.accrualId = accrualId;
		this.accrualAmount = accrualAmount;
		this.accrualCurrency = accrualCurrency;
		this.orderItemId = orderItemId;
	}
	
	public String getUserUUID() {
		return userUUID;
	}
	
	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}
	
	public Long getAccrualId() {
		return accrualId;
	}
	
	public void setAccrualId(Long accrualId) {
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
}
