package com.ums.rpc.data;

import java.io.Serializable;
import java.util.Set;

public class GroupDto implements Serializable {
	private static final long serialVersionUID = 8417989726584281657L;
	private Long id;
	private String groupName;
	private Set<String> groupAuthorities;
	
	public GroupDto() {}
	
	public GroupDto(Long id, String groupName, Set<String> groupAuthorities) {
		this.id = id;
		this.groupName = groupName;
		this.groupAuthorities = groupAuthorities;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public Set<String> getGroupAuthorities() {
		return groupAuthorities;
	}
	
	public void setGroupAuthorities(Set<String> groupAuthorities) {
		this.groupAuthorities = groupAuthorities;
	}
}
