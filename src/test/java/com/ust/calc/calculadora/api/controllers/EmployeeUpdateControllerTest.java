package com.ust.calc.calculadora.api.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeUpdateService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeUpdateControllerTest {
	
	@Mock
	private IEmployeeUpdateService iEmployeeService;
	
	private EmployeeUpdateController employeeUpdateController;
	
	@Before
	public void setUp() {
		employeeUpdateController = new EmployeeUpdateController(iEmployeeService);
	}
		
	@Test
	public void callRestTestOk() {
		final Employee employee = new Employee();
		final Employee employeeResponse = new Employee();
		Mockito.when(iEmployeeService.updateEmployee(employee)).thenReturn(employeeResponse);
		employeeUpdateController.updateEmployee(employee);
		assertNotNull(employeeResponse);
		//assertThat(employeeResponse).isNotNull();
	}

}
