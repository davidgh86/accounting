package com.ust.calc.calculadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.ust.calc.calculadora.clients.DataClientWSStub;
import com.ust.calc.calculadora.wsdlstub.FindByDni;
import com.ust.calc.calculadora.wsdlstub.FindByName;
import com.ust.calc.calculadora.wsdlstub.ObjectFactory;

import lombok.RequiredArgsConstructor;


@Configuration
@RequiredArgsConstructor
public class DataClientWSConfig {

	private final ObjectFactory WS_CLIENT_FACTORY;
	private final FindByDni requestDni;
	private final FindByName requestName;
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.ust.calc.calculadora.wsdlstub");
        return marshaller;
    }
	
	@Bean
    public DataClientWSStub dataClientWSStub(Jaxb2Marshaller marshaller) {
		
		final DataClientWSStub client = new DataClientWSStub(WS_CLIENT_FACTORY,requestDni,requestName);
        client.setDefaultUri("http://localhost:8080/datasource-ws/data");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
