package com.ust.calc.calculadora.api.controllers;

import org.springframework.http.ResponseEntity;

public interface EmployeeDeleteAPI {

	public ResponseEntity<String> deleteEmployee(String id);

}
