package com.example.googleCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleCloudDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage(){
		return "Hello I'm on the cloud";
	}

}
