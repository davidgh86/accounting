package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeAPI {

    ResponseEntity<Employee> createEmployee(final Employee employee);

}
