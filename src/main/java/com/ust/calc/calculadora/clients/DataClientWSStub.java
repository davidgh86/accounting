package com.ust.calc.calculadora.clients;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.ust.calc.calculadora.wsdlstub.FindByDni;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByName;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;
import com.ust.calc.calculadora.wsdlstub.ObjectFactory;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataClientWSStub extends WebServiceGatewaySupport {

	private final ObjectFactory WS_CLIENT_FACTORY;
	private final FindByDni requestDni;
	private final FindByName requestName;
	
	public FindByDniResponse findByDni(String param) {
		requestDni.setDni(param);		
		@SuppressWarnings("unchecked")
		JAXBElement<FindByDniResponse> proxyOutput = (JAXBElement<FindByDniResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createFindByDni(requestDni));
		return proxyOutput.getValue();
	}
	
	public FindByNameResponse findByName(String param) {
		requestName.setName(param);
		@SuppressWarnings("unchecked")
		JAXBElement<FindByNameResponse> proxyOutput = (JAXBElement<FindByNameResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createFindByName(requestName));
		return proxyOutput.getValue();
	}
}
