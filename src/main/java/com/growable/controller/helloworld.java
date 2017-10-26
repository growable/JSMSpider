package com.growable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class helloworld {
	
	@RequestMapping("/mvc")
	public String helloMvc() {
		return "home";
	}
}
