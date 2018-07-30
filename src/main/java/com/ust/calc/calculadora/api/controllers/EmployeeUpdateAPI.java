package com.ust.calc.calculadora.api.controllers;

import org.springframework.http.ResponseEntity;

import com.ust.calc.calculadora.api.resources.Employee;

public interface EmployeeUpdateAPI {
	
	ResponseEntity<Employee> updateEmployee(final Employee employee);
	
}
