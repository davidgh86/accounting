package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationDSClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceClientTest {
	
	@Mock
	private DataSourceClient dataSourceClient;
	
	@Mock EmployeeDS employeeDS;
	
	private IntegrationDSClient integrationDSClient;
	
	@Mock
	private ResponseEntity<EmployeeDS> employeeDSResponse;
	
	@Mock
	private EmployeeDS employeeResult;
	
	@Before
    public void setUp() {
        integrationDSClient = new IntegrationDSClientImpl(dataSourceClient);
    }
	
	@Test
	public void happyTest() throws JsonProcessingException {
		
    	when(dataSourceClient.newEmployee(employeeDS)).thenReturn(employeeDSResponse);
    	when(employeeDSResponse.getBody()).thenReturn(employeeResult);
    	
    	employeeResult = integrationDSClient.newEmployee(employeeDS);
    	
    	assertThat(employeeResult).isNotNull();
		
	}

}
