package com.seleniumexpress.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		
		System.out.println(userInfoDTO.isTermAndCondition());
		
		if (result.hasErrors()) {
			// System.out.println("My form has errors...");
			
			List<ObjectError> allErrors = result.getAllErrors();
			
			allErrors.forEach(e -> System.out.println(e));
			
			return "home-page";
		}
		return "result-page";
	}

//	@RequestMapping("/")
//	public String showHomePage(Model model) {
//
//		// Read the existing property by fetching it from DTO.
//		UserInfoDTO infoDTO = new UserInfoDTO();
//		model.addAttribute("userInfo", infoDTO);
//
//		return "home-page";
//	}
//
//	@RequestMapping("/process-homepage")
//	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
//		
//		// Writing the value to the properties by fetching from the url.
//		System.out.println("user name is " + userInfoDTO.getUserName());
//		System.out.println("crush name is " + userInfoDTO.getCrushName());
//
//		model.addAttribute("userInfo", userInfoDTO);
//
//		return "result-page";
//	}

	// Parameter name exact same hony chahiye jo form se aa rahy hn agr ye change
	// howe to exception throw kre ga or app crash ho jae gi agr hm chahty hn k
	// hmari app k paramenter names change hone chahiye hn to hum
	// @RequestParam("userName") is tarah use kren gy.

//	@RequestMapping("/process-homepage")
//	public String showResultPage(@RequestParam String userName, @RequestParam String crushName, Model model) {
//		System.out.println("user name is " + userName);
//		System.out.println("crush name is " + crushName);
//
//		model.addAttribute("userName", userName);
//		model.addAttribute("crushName", crushName);
//
//		return "result-page";
//	}

}