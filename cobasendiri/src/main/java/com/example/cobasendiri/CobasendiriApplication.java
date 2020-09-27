package com.example.cobasendiri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CobasendiriApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobasendiriApplication.class, args);
	}

}
