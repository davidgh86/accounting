package com.ust.calc.calculadora.api.services.impl;

import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;
import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeUpdateService;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClientUpdate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeUpdateServiceImpl implements IEmployeeUpdateService{
	
	private final IntegrationDSClientUpdate integrationDSClientUpdate;
	private final EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private final EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;
	
	@Override
	public Employee updateEmployee(final Employee employee) {
		EmployeeDS employeeDS = converterEmployeeToEmployeeDS.convert(employee);
		EmployeeDS employeeUpdated = integrationDSClientUpdate.employeeUpdate(employeeDS);
		return converterEmployeeDSToEmployee.convert(employeeUpdated);
	}
	

}
