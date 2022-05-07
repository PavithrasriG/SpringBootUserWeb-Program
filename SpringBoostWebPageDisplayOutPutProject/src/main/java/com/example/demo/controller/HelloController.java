package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	
@GetMapping("/")
		public String helloController() {
			return "Welcome to World";
			
		}
		
}
// change the server port