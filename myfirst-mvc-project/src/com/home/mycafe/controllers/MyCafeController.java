package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	
	// Return the welcome-page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		// sending data to view(jsp page)
		/*
		 * String myName = "Aakash Khatri";
		 * 
		 * model.addAttribute("myNameValue", myName);
		 */
		
		return "welcom-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {
		// Handle the data recieved from user
		String userEnteredValue = request.getParameter("foodType");
		
		//adding the captured value to the model
		model.addAttribute("userValue", userEnteredValue);
		
		//set the user data with the model and send it to view
		return "process-order";
	}
	
}
