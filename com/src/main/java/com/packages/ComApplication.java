package com.packages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComApplication.class, args);
		System.out.println("runnig on 8080");
	}
	
}
