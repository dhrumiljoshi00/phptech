package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	
	
	@RequestMapping("/")
	 public String helloworld() {
		 
		 return "hello spring boot";
	 }

}
