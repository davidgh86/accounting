package com.ust.calc.calculadora.clients.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.EmployeeDeleteClient;
import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;
import com.ust.calc.calculadora.datasource.api.DataOperationPortService;

@Component
public class EmployeeDeleteClientImpl implements EmployeeDeleteClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeleteClientImpl.class);

	private final DataOperationPortService dataOperationPortService;
	
	@Autowired
	public EmployeeDeleteClientImpl(DataOperationPortService dataOperationPortService) {
		this.dataOperationPortService = dataOperationPortService;
	}
	
	@Override
	public void deleteEmployee(final String id) {
		LOGGER.info("Request for external service: {}", id);
		DataOperation dataOperation = dataOperationPortService.getDataOperationPortImplPort();
        dataOperation.delete(id);
		LOGGER.info("Response for external service: {}", id);
	}
}
