package com.ust.calc.calculadora.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeResumeListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ResumeListEmployeeController implements ResumeListEmployeeAPI {
	
	private final IEmployeeResumeListService employeeResumeListService;
	
	@Autowired
	public ResumeListEmployeeController(IEmployeeResumeListService employeeResumeListService) {
		this.employeeResumeListService = employeeResumeListService;
	}

	@ApiOperation(value = "resume list employee resource", response = Employee.class, nickname = "resumeListEmployee", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 201, message = "resume list employee resource") })
	@GetMapping(path = "/employee/data")
	public ResponseEntity<List<Employee>> resumeListEmployee() {
		
		return new ResponseEntity<List<Employee>>(employeeResumeListService.resumeListEmployee(), HttpStatus.OK);
	}

}
