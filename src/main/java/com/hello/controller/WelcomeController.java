package com.hello.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Teste");
		return "welcome";
	}
}
