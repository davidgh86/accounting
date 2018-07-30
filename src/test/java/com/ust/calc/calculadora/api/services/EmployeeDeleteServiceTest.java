package com.ust.calc.calculadora.api.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.services.impl.EmployeeDeleteServiceImpl;
import com.ust.calc.calculadora.clients.EmployeeDeleteClient;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDeleteServiceTest {

	private EmployeeDeleteService employeeDeleteServiceImpl;
	
	@Mock
	private EmployeeDeleteClient employeeDeleteClient;
	
	@Before
	public void setup() {
		employeeDeleteServiceImpl = new EmployeeDeleteServiceImpl(employeeDeleteClient);
	}
	
	@Test
	public void happyTest() {
		Mockito.doNothing().when(employeeDeleteClient).deleteEmployee(Mockito.any());
		employeeDeleteServiceImpl.deleteEmployee("1");
	}
}
