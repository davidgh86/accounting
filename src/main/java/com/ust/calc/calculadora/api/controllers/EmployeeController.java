package com.ust.calc.calculadora.api.controllers;

import javax.validation.Valid;

import com.ust.calc.calculadora.services.IEmployeeCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.api.resources.Employee;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


	
@RestController
public class EmployeeController implements EmployeeAPI {


	private final IEmployeeCreationService employeeCreationService;
	
	@Autowired
	public EmployeeController(IEmployeeCreationService employeeCreationService) {
		this.employeeCreationService = employeeCreationService;
	}
	
	@ApiOperation(value = "create a paysheet resource", response = Employee.class, nickname = "createPaysheet", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE, tags= {"employee"})
	@ApiResponses({ @ApiResponse(code = 201, message = "create a paysheet resource") })
	@PostMapping(path = "/employee")
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody final Employee employee) {
		
		
		return new ResponseEntity<Employee>(employeeCreationService.createEmployee(employee), HttpStatus.CREATED);
	}

}
