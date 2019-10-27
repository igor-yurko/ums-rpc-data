package com.ums.rpc.data;

import java.io.Serializable;

public class UserContactLinkDto implements Serializable {
	private static final long serialVersionUID = -4054455349040325593L;
	private Long id;
	private ContactLinkType type;
	private String link;
	private Boolean isPublic;
	
	public UserContactLinkDto() {}
	
	public UserContactLinkDto(Long id, ContactLinkType type, String link, Boolean isPublic) {
		this.id = id;
		this.type = type;
		this.link = link;
		this.isPublic = isPublic;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public ContactLinkType getType() {
		return type;
	}
	
	public void setType(ContactLinkType type) {
		this.type = type;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public Boolean getPublic() {
		return isPublic;
	}
	
	public void setPublic(Boolean aPublic) {
		isPublic = aPublic;
	}
}
