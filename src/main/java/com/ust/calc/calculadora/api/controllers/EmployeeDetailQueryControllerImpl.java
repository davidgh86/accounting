package com.ust.calc.calculadora.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.services.IEmployeeDetailQueryService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeDetailQueryControllerImpl implements IEmployeeDetailQueryController {

	private final IEmployeeDetailQueryService detailQueryService;
	
	@ApiOperation(value = "get employee detailed info through NIF", httpMethod = "GET", response = Employee.class, nickname = "getEmployeeDetails", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "employee detailed info retrieved") })
	@GetMapping("/employee/search/findByDni")
	@Override
	public ResponseEntity<Employee> getEmployeeDetailsByNIF(@RequestParam("dni") final String param) {		
		
		return new ResponseEntity<Employee>(detailQueryService.getEmployeeDetailsByNIF(param),HttpStatus.OK);
	}

	@ApiOperation(value = "get detailed list of employee infos through 'name%'", httpMethod = "GET", response = Employee.class, nickname = "getEmployeeDetails", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "list of employee detailed info retrieved") })
	@GetMapping("/employee/search/findByName")
	@Override	
	public ResponseEntity<List<Employee>> getEmployeeDetailsByName(@RequestParam("name") final String param) {
		return new ResponseEntity<List<Employee>>(detailQueryService.getEmployeeDetailsByName(param),HttpStatus.OK);
	}

}
