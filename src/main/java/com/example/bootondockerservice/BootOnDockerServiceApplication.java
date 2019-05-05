package com.example.bootondockerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class BootOnDockerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOnDockerServiceApplication.class, args);
	}

	@RequestMapping(value="/home")
	public String home() {
		return "Hello Docker World";

	}

}
