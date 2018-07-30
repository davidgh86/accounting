package com.ust.calc.calculadora.clients.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.services.converters.DataToEmployeeDSConverter;
import com.ust.calc.calculadora.api.services.converters.EmployeeDSToDataConverter;
import com.ust.calc.calculadora.clients.DataSourceWSClientUpdate;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationDSClientUpdateImpl;
import com.ust.calc.calculadora.datasource.api.Data;

@RunWith(MockitoJUnitRunner.class)
public class IntegrationDSClientUpdateTest {
	
	@Mock
	private DataSourceWSClientUpdate dataSourceWS;
	
	private IntegrationDSClientUpdate integrationDSClientUpdate;
	
	@Mock
	private EmployeeDSToDataConverter employeeDsToDataConverter;
	
	@Mock
	private DataToEmployeeDSConverter dataToEmployeeDSConverter;
	
	@Mock
	private Data data;
	
	@Mock
	private EmployeeDS employeeResponse;
	
	@Mock 
	private EmployeeDS employeeDS;
	
	@Mock
	private Data outputClientCall;
	
	@Before
    public void setUp() {
		integrationDSClientUpdate = new IntegrationDSClientUpdateImpl(dataSourceWS, employeeDsToDataConverter, dataToEmployeeDSConverter);
	}
	
	@Test
    public void testEmployeeUpdate() {
		
		when(dataSourceWS.dataUpdate(data)).thenReturn(outputClientCall);
		when(employeeDsToDataConverter.convert(Mockito.any())).thenReturn(new Data());
		when(dataToEmployeeDSConverter.convert(Mockito.any())).thenReturn(new EmployeeDS());
		employeeResponse = integrationDSClientUpdate.employeeUpdate(employeeDS);
		assertThat(employeeResponse).isNotNull();
		
	}

}
