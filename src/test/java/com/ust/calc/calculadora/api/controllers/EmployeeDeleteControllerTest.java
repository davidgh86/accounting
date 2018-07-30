package com.ust.calc.calculadora.api.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.services.EmployeeDeleteService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDeleteControllerTest {

	private EmployeeDeleteController employeeDeleteController;
	
	@Mock
	private EmployeeDeleteService employeeDeleteService;
	
	@Before
	public void setup() {
		employeeDeleteController = new EmployeeDeleteController(employeeDeleteService);
	}
	
	@Test
	public void happyTest() {
		Mockito.doNothing().when(employeeDeleteService).deleteEmployee(Mockito.any());
		employeeDeleteController.deleteEmployee("1");
	}
	
	
	@Test
	public void noHappyTest() {
		employeeDeleteController.deleteEmployee(null);
	}
	
}
