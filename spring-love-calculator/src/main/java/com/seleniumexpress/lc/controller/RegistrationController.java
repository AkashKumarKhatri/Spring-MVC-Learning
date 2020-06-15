package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
		
		// Load the saved user data from the database
		Phone phone = new Phone();
		phone.setCountryCode("92");
		phone.setUserNumber("3360231273");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setEmail("kkatriakash@gmail.com");
		communicationDTO.setPhone(phone);
		
		userRegistrationDTO.setAge(25);
		userRegistrationDTO.setCountryName("pak");
		userRegistrationDTO.setGender("male");
		userRegistrationDTO.setName("Akash");
		userRegistrationDTO.setUserName("Khatri");
		userRegistrationDTO.setPassword(null);
		String[] hobbiess = new String[] {"cricket", "reading"};
		userRegistrationDTO.setHobbies(hobbiess);
		
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserRegistration(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("Inside processUserRegistration() method");
		return "registration-success";
	}
	
}
