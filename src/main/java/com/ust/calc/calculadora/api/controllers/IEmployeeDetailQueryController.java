package com.ust.calc.calculadora.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ust.calc.calculadora.api.resources.Employee;

public interface IEmployeeDetailQueryController {

    ResponseEntity<Employee> getEmployeeDetailsByNIF(final String param);
	ResponseEntity<List<Employee>> getEmployeeDetailsByName(final String param);
}
