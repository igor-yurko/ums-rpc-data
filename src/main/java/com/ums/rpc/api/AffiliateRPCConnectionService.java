package com.ums.rpc.api;

import com.ums.rpc.data.UserSubscriptionDto;

public interface AffiliateRPCConnectionService {
	UserSubscriptionDto getUserActiveSubscription(String userUuid);
}
