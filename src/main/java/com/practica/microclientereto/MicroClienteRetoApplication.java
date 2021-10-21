package com.practica.microclientereto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroClienteRetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroClienteRetoApplication.class, args);
	}

}
