package com.sky.moviedbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(scanBasePackages = {"com.example" })
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sky.moviedbservice.repository")
public class MovieDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDbServiceApplication.class, args);
	}

}
