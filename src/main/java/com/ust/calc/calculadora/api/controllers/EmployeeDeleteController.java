package com.ust.calc.calculadora.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.api.services.EmployeeDeleteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeDeleteController implements EmployeeDeleteAPI {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeleteController.class);
	
	private final EmployeeDeleteService employeeDeleteService;
	
	@Autowired
	public EmployeeDeleteController(EmployeeDeleteService employeeDeleteService) {
		this.employeeDeleteService = employeeDeleteService;
	}
	
	@ApiOperation(
			value = "Delete employee", 
			httpMethod = "DELETE", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			tags = {"Employee"}
	)
	@ApiResponses({ 
		@ApiResponse(code = 200, message = "Delete the employee"),
		@ApiResponse(code = 404, message = "Employee not exist")
	})
	@DeleteMapping(path = "/employee/{id}")
	@Override
	public ResponseEntity<String> deleteEmployee(@ApiParam(value="ID of employee to delete") @PathVariable(required=true) final String id) {
		LOGGER.info("Start resource /employee/{id} with ID -> {}", id);
		
		employeeDeleteService.deleteEmployee(id);
		LOGGER.info("End resource /employee/{id} with ID -> {}", id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
