package com.ust.calc.calculadora.clients;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataSourceWSClient implements IDataSourceWSClient{

	private final DataClientWSStub clientWSStub;
	
	@Override
	public Data getEmployeeDetailsByNIF(String dni) {
		
		final FindByDniResponse findByDniResponse = clientWSStub.findByDni(dni);
		return findByDniResponse.getReturn();		
	}

	@Override
	public List<Data> getEmployeeDetailsByName(String name) {
		final FindByNameResponse findByNameResponse = clientWSStub.findByName(name);
		return findByNameResponse.getReturn();
	}

}
