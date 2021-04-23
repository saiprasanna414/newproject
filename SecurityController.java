package com.example.spring.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class SecurityController {
	@GetMapping("/getmsg")
	public String greetings() {
		return "spring security greetings";
	}

}
