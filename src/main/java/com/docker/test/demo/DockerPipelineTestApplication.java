package com.docker.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerPipelineTestApplication {

	@GetMapping
	public String sayHeloo() {
		return "Welcome to Jenkins docker pipeline testing ";
	}

	public static void main(String[] args) {

		SpringApplication.run(DockerPipelineTestApplication.class, args);
	}

}
