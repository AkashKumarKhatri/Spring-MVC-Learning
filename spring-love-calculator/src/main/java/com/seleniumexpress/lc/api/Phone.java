package com.seleniumexpress.lc.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Phone {
	private String countryCode;
	private String userNumber;
	
	@Override
	public String toString() {
		return countryCode+"-"+userNumber;
	}
}
