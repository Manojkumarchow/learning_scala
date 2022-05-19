package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BasicService;

@RestController
public class BasicController {
	
	@Autowired
	BasicService basicService;

	@GetMapping("/")
	public String homePage() {
		return "Learning Spring Boot";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello " + basicService.displayName();
	}
	
	@GetMapping("/showList")
	public List<String> showList() {
		return basicService.sendList();
	}
}
