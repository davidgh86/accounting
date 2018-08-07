package com.ust.calc.calculadora.config;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CalculadoraConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(); 
   }
	
	@Bean
	public SimpleDateFormat dateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		
	}

}