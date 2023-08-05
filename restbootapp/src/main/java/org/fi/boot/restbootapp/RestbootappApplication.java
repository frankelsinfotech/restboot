package org.fi.boot.restbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"org.fi.boot.restbootapp.controllers"} )
public class RestbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestbootappApplication.class, args);
	}

}
