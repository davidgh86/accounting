package com.ust.calc.calculadora.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeUpdateService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeUpdateController implements EmployeeUpdateAPI {
	
	private final IEmployeeUpdateService iEmployeeUpdateService;
	
	@Autowired
	public EmployeeUpdateController(IEmployeeUpdateService employeeUpdateService) {
		this.iEmployeeUpdateService = employeeUpdateService;
	}
	
	@ApiOperation(value = "update a employee resource", response = Employee.class, nickname = "UpdateEmployee", httpMethod = "PUT", produces = MediaType.APPLICATION_JSON_VALUE, tags= {"employee"})
	@ApiResponses({ @ApiResponse(code = 200, message = "update a employee resource") })
	@PutMapping(path = "/employee")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee) {
		
		return ResponseEntity.ok(iEmployeeUpdateService.updateEmployee(employee));
		
	}
	
}
