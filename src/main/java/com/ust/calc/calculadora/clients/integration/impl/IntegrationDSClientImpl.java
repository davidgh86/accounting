package com.ust.calc.calculadora.clients.integration.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;

@Service
public class IntegrationDSClientImpl implements IntegrationDSClient {

	private final DataSourceClient dataSourceClient;
	
	public IntegrationDSClientImpl(final DataSourceClient dSClient) {
		dataSourceClient = dSClient;
	}
	
	@Override
	public EmployeeDS newEmployee(EmployeeDS employeeDS) {
		ResponseEntity<EmployeeDS> employee = dataSourceClient.newEmployee(employeeDS);
		return employee.getBody();
	}

}
