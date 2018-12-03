package com.luv2code.springboot.demo.actuatordemo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFunRestController {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello World! Time on the Server is " + LocalDateTime.now();
	}
	
	@GetMapping("/fortune")
	public String getFortune()
	{
		return "Today is your Lucky day!";
	}
	
	@GetMapping("/coach")
	public String getCoachService()
	{
		return "Run a hard 5k!";
	}
	
	
}
  