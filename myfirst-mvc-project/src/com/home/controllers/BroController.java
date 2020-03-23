package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {
	
	//@ResponseBody
	@RequestMapping("cricketbat")
	public String giveCricketBat() {
		return "MRFCricketbat";
		//return "/WEB-INF/view/MRFCricketbat.jsp";
		//return "hey man.. this is your cricket bat.";
	}
	
}
