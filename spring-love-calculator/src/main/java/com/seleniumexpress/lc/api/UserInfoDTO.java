package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfoDTO {
	
	@NotBlank(message = "* Your Name can't be blank")
	@Size(min = 3, max = 15, message = "* Your Name should have char between 3-15")
	private String userName; // = "Mr. X";
	
	@NotBlank(message = "* Crush Name can't be blank")
	@Size(min = 3, max = 15, message = "* Crush Name should have char between 3-15")
	private String crushName; // = "Miss. Y";
	
	@AssertTrue(message = "* agree to use our app")
	private boolean termAndCondition;
	
	public UserInfoDTO() {
		// System.out.println("UserInfoDTO object created automatically...");
	}
	
}
