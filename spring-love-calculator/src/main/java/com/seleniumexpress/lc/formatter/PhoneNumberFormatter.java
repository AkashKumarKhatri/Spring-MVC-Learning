package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside the print method of the PhoneNumberFormatter");
		return phone.getCountryCode()+"-"+phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse method of the PhoneNumberFormatter");
		
		Phone phone = new Phone();
		
		// Split the string received from the user
		String[] phoneNumberArray = completePhoneNumber.split("-");
		
		// Whether the number consists of '-'
		int index = completePhoneNumber.indexOf("-");
		
		if (index == -1) {
			// If the '-' is not found, then add 92 as the default country code.
			phone.setCountryCode("92");
			phone.setUserNumber(phoneNumberArray[0]);
		} else {
			// Extract the countryCode & userCode and set it to the phone class countryCode & userCode
			
			// If the countryCode not found before the '-', then add 92 as the default country code.
			if (phoneNumberArray[0].equals("") || phoneNumberArray[0].length() == 0) {
				phone.setCountryCode("92");
			} else {
				phone.setCountryCode(phoneNumberArray[0]);
			}
			
			phone.setUserNumber(phoneNumberArray[1]);
		}
		
		return phone;
	}	
}
