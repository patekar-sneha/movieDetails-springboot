package com.movieinfo.movieDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.movieinfo.controller", "com.movieinfo.model"})
@SpringBootApplication
public class MovieDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailsApplication.class, args);
	}

}
