package com.seleniumexpress.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "result-page";
	}
	
	
	/*
	 * @RequestMapping("/") public String showHomePage(Model model) {
	 * 
	 * UserInfoDTO infoDTO = new UserInfoDTO(); model.addAttribute("userInfo",
	 * infoDTO);
	 * 
	 * return "home-page"; }
	 * 
	 * @RequestMapping("/process-homepage") public String showResultPage(UserInfoDTO
	 * userInfoDTO, Model model) {
	 * System.out.println("user name is "+userInfoDTO.getUserName());
	 * System.out.println("crush name is "+userInfoDTO.getCrushName());
	 * 
	 * model.addAttribute("userInfo", userInfoDTO);
	 * 
	 * return "result-page"; }
	 */
	
	/*
	 * @RequestMapping("/process-homepage") public String
	 * showResultPage(@RequestParam String userName, @RequestParam String crushName,
	 * Model model) { System.out.println("user name is "+userName);
	 * System.out.println("crush name is "+crushName);
	 * 
	 * model.addAttribute("userName", userName); model.addAttribute("crushName",
	 * crushName);
	 * 
	 * return "result-page"; }
	 */
	
}