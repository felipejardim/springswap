package com.felipejardim.StarWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StarWarsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StarWarsApplication.class, args);
	}

}
