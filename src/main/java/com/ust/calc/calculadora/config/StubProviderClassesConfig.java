package com.ust.calc.calculadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.calc.calculadora.wsdlstub.FindByDni;
import com.ust.calc.calculadora.wsdlstub.FindByName;
import com.ust.calc.calculadora.wsdlstub.ObjectFactory;

@Configuration
public class StubProviderClassesConfig {

	@Bean
	public FindByDni requestDni() {
		return new FindByDni();
	}
	
	@Bean
	public FindByName requestName() {
		return new FindByName();
	}
	
	@Bean
	public ObjectFactory WS_CLIENT_FACTORY() {
		return new ObjectFactory();
	}
}
