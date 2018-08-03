package com.ust.calc.calculadora.clients;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.Delete;
import com.ust.calc.calculadora.wsdlstub.DeleteResponse;
import com.ust.calc.calculadora.wsdlstub.ObjectFactory;
import com.ust.calc.calculadora.wsdlstub.Update;
import com.ust.calc.calculadora.wsdlstub.UpdateResponse;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class DataSourceWSStubModifications extends WebServiceGatewaySupport{

	//private final DataOperationPortImplService service;
	private final ObjectFactory WS_CLIENT_FACTORY;
	
	public DeleteResponse deleteData(String id) {
		
		Delete delete = new Delete();
		delete.setId(id);
		@SuppressWarnings("unchecked")
		JAXBElement<DeleteResponse> proxyOutput = (JAXBElement<DeleteResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createDelete(delete));
		return proxyOutput.getValue();
	}
	
	public UpdateResponse update(Data data) {
		
		Update update = new Update();
		update.setArg0(data);
		@SuppressWarnings("unchecked")
		JAXBElement<UpdateResponse> proxyOutput = (JAXBElement<UpdateResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createUpdate(update));
		return proxyOutput.getValue();
	}

}
