package com.ums.rpc.api;

import com.ums.rpc.data.CreditedAccrualDto;
import com.ums.rpc.data.TokensDto;
import com.ums.rpc.data.UserDto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface UmsRPCConnectionService {
	Boolean addAccrualAmountToWallet(CreditedAccrualDto accrual);
	Boolean isOrderPaid(String orderUuid);
	TokensDto setBaseUserRole(String productApiKey, String userUuid, String role);
	UserDto getUserProfileData(String userUuid);
	BigDecimal getSystemIncomePerPeriod(ZonedDateTime startTime, ZonedDateTime endTime);
}
