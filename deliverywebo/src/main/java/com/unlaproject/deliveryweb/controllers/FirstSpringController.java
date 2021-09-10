package com.unlaproject.deliveryweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firstspring")
public class FirstSpringController {
	
	@GetMapping("home")
	public String home() {
		return "home";
	}

}
