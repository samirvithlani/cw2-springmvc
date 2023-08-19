package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//compoennt
//service
//repository
//controller    --> java --> spring bean

@Controller
public class HomeController {


	@GetMapping("/home")
	public String home() {
		System.out.println("home method called....");	
		//home.jsp....
		return "home";
	}
	
	
}
