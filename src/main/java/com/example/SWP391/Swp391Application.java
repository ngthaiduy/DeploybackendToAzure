package com.example.SWP391;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Swp391Application {



	public static void main(String[] args) {
		SpringApplication.run(Swp391Application.class, args);
	}

}
