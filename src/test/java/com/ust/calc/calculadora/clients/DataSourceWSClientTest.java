package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceWSClientTest {
	
	
	private DataSourceWSClient dataSourceClient;	
	@Mock
	private DataClientWSStub dataClientWSStub;
	
	@Before
    public void setUp() {
		dataSourceClient = new DataSourceWSClient(dataClientWSStub);
    }
	

	@Test
	public void testNIFOK() throws JsonProcessingException {
		final String testDni = "83479509F";
		final EmployeeDS employeeResult = new EmployeeDS();
		final FindByDniResponse outputData = new FindByDniResponse();
		when(dataClientWSStub.findByDni(testDni)).thenReturn(outputData);
		dataSourceClient.getEmployeeDetailsByNIF(testDni);
    	
    	assertThat(employeeResult).isNotNull();
		
	}
	
	@Test
    public void testNameOK() throws JsonProcessingException {
		final String nameParam = "alotes";		
		final FindByNameResponse outputData = new FindByNameResponse();
		when(dataClientWSStub.findByName(nameParam)).thenReturn(outputData);
		
		List<Data> employeeResult = dataSourceClient.getEmployeeDetailsByName(nameParam);
    	
    	assertThat(employeeResult).isNotNull();
		
	}

}
