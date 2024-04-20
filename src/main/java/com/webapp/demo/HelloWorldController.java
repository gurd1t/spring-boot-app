package com.webapp.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
    public String helloWorld() {
        return "This is a Simple Spring Boot App deployed on a Kubernetes cluster...";
    }
}
