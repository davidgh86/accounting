package com.ust.calc.calculadora.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.services.EmployeeDeleteService;
import com.ust.calc.calculadora.clients.EmployeeDeleteClient;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

	private EmployeeDeleteClient employeeDeleteClient;
	
	@Autowired
	public EmployeeDeleteServiceImpl(EmployeeDeleteClient employeeDeleteClient) {
		this.employeeDeleteClient = employeeDeleteClient;
	}
	
	@Override
	public void deleteEmployee(final String id) {
		employeeDeleteClient.deleteEmployee(id);
	}
}
