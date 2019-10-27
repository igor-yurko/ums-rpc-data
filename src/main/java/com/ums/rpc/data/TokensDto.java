package com.ums.rpc.data;

import java.io.Serializable;

public class TokensDto implements Serializable {
	private static final long serialVersionUID = 7119679174936689415L;
	private String accessToken;
	private String refreshToken;
	
	public TokensDto() {}
	
	public TokensDto(String accessToken, String refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}
	
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
