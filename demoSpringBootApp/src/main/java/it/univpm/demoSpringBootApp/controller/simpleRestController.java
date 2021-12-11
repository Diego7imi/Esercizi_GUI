package it.univpm.demoSpringBootApp.controller;

import org.springframework.web.bind.annotation.RestController;

import it.univpm.demoSpringBootApp.model.HelloWorldClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class simpleRestController {
	
	@GetMapping("/hello")
	public HelloWorldClass exampleMethod(@RequestParam(name="param1", defaultValue="World") String param1)
	{
		return new HelloWorldClass("Diego", "Settimi");
	}
	
	@PostMapping("/hello")
	public HelloWorldClass exampleMethod2(@RequestBody HelloWorldClass body)
	{
		return body;
	}
}
