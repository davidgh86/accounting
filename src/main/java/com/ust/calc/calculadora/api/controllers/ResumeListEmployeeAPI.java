package com.ust.calc.calculadora.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ust.calc.calculadora.api.resources.Employee;

public interface ResumeListEmployeeAPI {
	
	ResponseEntity<List<Employee>> resumeListEmployee();

}
