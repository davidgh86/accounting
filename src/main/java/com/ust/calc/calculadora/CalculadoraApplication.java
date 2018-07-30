package com.ust.calc.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalculadoraApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

}