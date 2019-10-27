package com.ums.rpc.data;

import java.io.Serializable;

public class UserContactDto implements Serializable {
	private static final long serialVersionUID = -4028278042917652927L;
	private Long id;
	private ContactType type;
	private String description;
	private Boolean isPublic;
	
	public UserContactDto() {}
	
	public UserContactDto(Long id, ContactType type, String description, Boolean isPublic) {
		this.id = id;
		this.type = type;
		this.description = description;
		this.isPublic = isPublic;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public ContactType getType() {
		return type;
	}
	
	public void setType(ContactType type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getPublic() {
		return isPublic;
	}
	
	public void setPublic(Boolean aPublic) {
		isPublic = aPublic;
	}
}
