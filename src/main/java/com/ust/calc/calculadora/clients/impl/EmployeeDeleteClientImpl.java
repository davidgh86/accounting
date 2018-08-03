package com.ust.calc.calculadora.clients.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.DataSourceWSClientModifications;
import com.ust.calc.calculadora.clients.EmployeeDeleteClient;

@Component
public class EmployeeDeleteClientImpl implements EmployeeDeleteClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeleteClientImpl.class);

	private final DataSourceWSClientModifications dataOperationPortService;
	
	@Autowired
	public EmployeeDeleteClientImpl(DataSourceWSClientModifications dataOperationPortService) {
		this.dataOperationPortService = dataOperationPortService;
	}
	
	@Override
	public void deleteEmployee(final String id) {
		LOGGER.info("Request for external service: {}", id);
		dataOperationPortService.delete(id);
		LOGGER.info("Response for external service: {}", id);
	}
	
}
