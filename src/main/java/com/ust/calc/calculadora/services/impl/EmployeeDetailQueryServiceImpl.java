package com.ust.calc.calculadora.services.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.DataSourceWSClient;
import com.ust.calc.calculadora.services.IEmployeeDetailQueryService;
import com.ust.calc.calculadora.services.converters.DataProviderToEmployeeConverter;
import com.ust.calc.calculadora.wsdlstub.Data;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeDetailQueryServiceImpl implements IEmployeeDetailQueryService {

	private final DataSourceWSClient wsClient;
	private final DataProviderToEmployeeConverter converter;
	
	@Override
	public Employee getEmployeeDetailsByNIF(final String param) {		
		return converter.convert(wsClient.getEmployeeDetailsByNIF(param));
	}

	@Override
	public List<Employee> getEmployeeDetailsByName(final String param) {
		List<Employee> lstReturnedEmployees = new LinkedList<Employee>();
		for(Data providerEmployee : wsClient.getEmployeeDetailsByName(param)) {
			lstReturnedEmployees.add(converter.convert(providerEmployee));
		}
		return lstReturnedEmployees;
	}

}
