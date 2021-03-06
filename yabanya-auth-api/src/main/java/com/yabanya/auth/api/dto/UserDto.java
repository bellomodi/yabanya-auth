package com.yabanya.auth.api.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;

@XmlRootElement(name = "userDto")
@ApiModel(value = "UserDto")
public class UserDto implements Serializable {

	private static final long serialVersionUID = -3475219908795373184L;
	
	private Long id;
	private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String emailAddress;
    private String contactAddress;

    private UserDto() {}

    private UserDto(final UserDtoBuilder builder) {
    	this.id = builder.id;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.username = builder.username;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
        this.contactAddress = builder.contactAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getPassword() { return this.password; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(final String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public static UserDtoBuilder newBuilder() {
        return new UserDtoBuilder();
    }

    public static class UserDtoBuilder {

    	private Long id;
        private String firstName;
        private String middleName;
        private String lastName;
        private String username;
        private String password;
        private String phoneNumber;
        private String emailAddress;
        private String contactAddress;
        
        public UserDtoBuilder id(final Long id) {
        	this.id =  id;
        	return this;
        }

        public UserDtoBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserDtoBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder username(final String username) {
            this.username = username;
            return this;
        }

        public UserDtoBuilder password(final String password) {
            this.password = password;
            return this;
        }

        public UserDtoBuilder phoneNumber(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserDtoBuilder emailAddress(final String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserDtoBuilder contactAddress(final String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }
}
