package com.seleniumexpress.lc.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfoDTO {

	private String userName = "Mr. X";
	private String crushName = "Miss. Y";
	
	public UserInfoDTO() {
		System.out.println("UserInfoDTO object created automatically...");
	}
	
}
