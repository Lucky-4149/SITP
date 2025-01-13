package com.softpro.SITP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SitpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitpApplication.class, args);
	}
}
