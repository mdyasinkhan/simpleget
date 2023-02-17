package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimplegetApplication {
	
	@GetMapping("/result")
	public String get() {
		
		return "HELLO";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimplegetApplication.class, args);
	}

}
