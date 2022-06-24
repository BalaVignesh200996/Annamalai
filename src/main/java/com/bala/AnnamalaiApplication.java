package com.bala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnnamalaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnamalaiApplication.class, args);
	}
	
		
	@GetMapping("/get/try")
	 public String getNew()
	 {
	 
	 return "First try";

}

}