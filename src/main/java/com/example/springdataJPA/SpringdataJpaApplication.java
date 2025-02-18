package com.example.springdataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringdataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaApplication.class, args);
	}

}
