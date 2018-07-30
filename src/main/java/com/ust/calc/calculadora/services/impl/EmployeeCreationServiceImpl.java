package com.ust.calc.calculadora.services.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;
import com.ust.calc.calculadora.services.IEmployeeCreationService;
import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeCreationServiceImpl implements IEmployeeCreationService {
	
	private final IntegrationDSClient integrationDSClient;
	private final EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private final EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;
	
	public Employee createEmployee(Employee employee) {
		
		EmployeeDS employeeDS = converterEmployeeToEmployeeDS.convert(employee);
		
		employeeDS = integrationDSClient.newEmployee(employeeDS);		
		
		return converterEmployeeDSToEmployee.convert(employeeDS);
	}

}
