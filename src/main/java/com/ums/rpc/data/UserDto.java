package com.ums.rpc.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

public class UserDto implements Serializable {
	private static final long serialVersionUID = 1521330515932065076L;
	private Long id;
	private String email;
	private String nickName;
	private String gender;
	private String firstName;
	private String lastName;
	private Boolean verified;
	private Boolean enabled;
	private String userUUID;
	private String ancestor;
	private Set<GroupDto> groups;
	private Set<ProductRoleDto> productsRoles;
	private AbstractAddressDto address;
	private String language;
	private String country;
	private LocalDate birthday;
	private ZonedDateTime createdAt;
	private Map<String, String> productReferralLinks;
	private String croppedAvatarUri;
	private String originalAvatarUri;
	private Set<UserContactDto> userContacts;
	private Set<UserContactLinkDto> userContactLinks;
	private String bio;
	private String educationLevel;
	private String jobTitle;
	
	public UserDto() {}
	
	public UserDto(Long id, String email, String nickName, String gender, String firstName, String lastName, Boolean verified, Boolean enabled,
				   String userUUID, String ancestor, Set<GroupDto> groups, Set<ProductRoleDto> productsRoles, AbstractAddressDto address,
				   String language, String country, LocalDate birthday, ZonedDateTime createdAt, Map<String, String> productReferralLinks,
				   String croppedAvatarUri, String originalAvatarUri, Set<UserContactDto> userContacts, Set<UserContactLinkDto> userContactLinks,
				   String bio, String educationLevel, String jobTitle) {
		this.id = id;
		this.email = email;
		this.nickName = nickName;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.verified = verified;
		this.enabled = enabled;
		this.userUUID = userUUID;
		this.ancestor = ancestor;
		this.groups = groups;
		this.productsRoles = productsRoles;
		this.address = address;
		this.language = language;
		this.country = country;
		this.birthday = birthday;
		this.createdAt = createdAt;
		this.productReferralLinks = productReferralLinks;
		this.croppedAvatarUri = croppedAvatarUri;
		this.originalAvatarUri = originalAvatarUri;
		this.userContacts = userContacts;
		this.userContactLinks = userContactLinks;
		this.bio = bio;
		this.educationLevel = educationLevel;
		this.jobTitle = jobTitle;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Boolean getVerified() {
		return verified;
	}
	
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getUserUUID() {
		return userUUID;
	}
	
	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}
	
	public String getAncestor() {
		return ancestor;
	}
	
	public void setAncestor(String ancestor) {
		this.ancestor = ancestor;
	}
	
	
	public Set<ProductRoleDto> getProductsRoles() {
		return productsRoles;
	}
	
	public void setProductsRoles(Set<ProductRoleDto> productsRoles) {
		this.productsRoles = productsRoles;
	}
	
	public AbstractAddressDto getAddress() {
		return address;
	}
	
	public void setAddress(AbstractAddressDto address) {
		this.address = address;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public Map<String, String> getProductReferralLinks() {
		return productReferralLinks;
	}
	
	public void setProductReferralLinks(Map<String, String> productReferralLinks) {
		this.productReferralLinks = productReferralLinks;
	}
	
	public String getCroppedAvatarUri() {
		return croppedAvatarUri;
	}
	
	public void setCroppedAvatarUri(String croppedAvatarUri) {
		this.croppedAvatarUri = croppedAvatarUri;
	}
	
	public String getOriginalAvatarUri() {
		return originalAvatarUri;
	}
	
	public void setOriginalAvatarUri(String originalAvatarUri) {
		this.originalAvatarUri = originalAvatarUri;
	}
	
	public Set<UserContactDto> getUserContacts() {
		return userContacts;
	}
	
	public void setUserContacts(Set<UserContactDto> userContacts) {
		this.userContacts = userContacts;
	}
	
	public Set<UserContactLinkDto> getUserContactLinks() {
		return userContactLinks;
	}
	
	public void setUserContactLinks(Set<UserContactLinkDto> userContactLinks) {
		this.userContactLinks = userContactLinks;
	}
	
	public String getBio() {
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String getEducationLevel() {
		return educationLevel;
	}
	
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Set<GroupDto> getGroups() {
		return groups;
	}
	
	public void setGroups(Set<GroupDto> groups) {
		this.groups = groups;
	}
}
