package com.cursogit.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "service")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
