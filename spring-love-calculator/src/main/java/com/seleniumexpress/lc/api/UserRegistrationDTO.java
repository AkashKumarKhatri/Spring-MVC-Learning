package com.seleniumexpress.lc.api;

import lombok.Data;

@Data
public class UserRegistrationDTO {
	private String name;
	private String userName;
	private char[] password;
	private String countryName;
	private String[] hobbies;
	private String gender;
}
