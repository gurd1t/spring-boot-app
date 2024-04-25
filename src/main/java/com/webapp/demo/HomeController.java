package com.webapp.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

	@GetMapping(path = "/")
	public String home() {
		return "This is a Demo Spring Boot App deployed on AWS EKS Cluster using Jenkins.";
	}
}
