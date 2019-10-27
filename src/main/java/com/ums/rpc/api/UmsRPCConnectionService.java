package com.ums.rpc.api;

import com.ums.rpc.data.CreditedAccrualDto;
import com.ums.rpc.data.TokensDto;
import com.ums.rpc.data.UserDto;

public interface UmsRPCConnectionService {
	Boolean addAccrualAmountToWallet(CreditedAccrualDto accrual);
	Boolean isOrderPaid(String orderUuid);
	TokensDto setBaseUserRole(String productApiKey, String userUuid, String role);
	UserDto getUserProfileData(String userUuid);
}
