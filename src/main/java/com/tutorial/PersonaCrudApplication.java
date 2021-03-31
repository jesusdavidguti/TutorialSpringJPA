package com.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonaCrudApplication.class, args);
		
		System.out.println("Servicio rest Persona iniciado. A la espera de peticiones.");
	}

}
