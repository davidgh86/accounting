package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@FeignClient(name="xxx", url="http://localhost:8080/")
public interface DataSourceClient {

	@RequestMapping(method = RequestMethod.POST, path="data")
	public ResponseEntity<EmployeeDS> newEmployee(EmployeeDS employeeDS);
	
}
