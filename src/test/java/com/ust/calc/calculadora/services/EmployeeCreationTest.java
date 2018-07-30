package com.ust.calc.calculadora.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;
import com.ust.calc.calculadora.services.IEmployeeCreationService;
import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;
import com.ust.calc.calculadora.services.impl.EmployeeCreationServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeCreationTest {

    private IEmployeeCreationService employeeCreationService;

    private @Mock
    Employee employee;

    private @Mock
    IntegrationDSClient integrationDSClient;
    
    private @Mock
    DataSourceClient dataSourceClient;
    
    private @Mock 
    EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private @Mock 
	EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;

    @Before
    public void setUp() {
    	employeeCreationService = new EmployeeCreationServiceImpl(integrationDSClient,converterEmployeeToEmployeeDS, converterEmployeeDSToEmployee);
    }

    @Test
    public void testEmployeeCreation() {    	
    	final EmployeeDS outputClientCall = new EmployeeDS();	
        when(integrationDSClient.newEmployee(Mockito.any())).thenReturn(outputClientCall);
        when(converterEmployeeToEmployeeDS.convert(Mockito.any())).thenReturn(new EmployeeDS());
        when(converterEmployeeDSToEmployee.convert(Mockito.any())).thenReturn(new Employee());
        Employee outputService = employeeCreationService.createEmployee(employee);
        assertThat(outputService).isNotNull();
    }

}