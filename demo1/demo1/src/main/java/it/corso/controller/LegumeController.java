package it.corso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegumeController {
    
	@GetMapping
	public String getLegumes() {
		
		return "Controller des legumes";
	}
	
}
