package com.ust.calc.calculadora.clients;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.UpdateResponse;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceWSStubModificationsTest {
	
	private DataSourceWSClientModifications service;
	
	@Mock
	private DataSourceWSStubModifications dataSource;
	
	
	@Before
	public void setUp() {
		service = new DataSourceWSClientModifications(dataSource);
	}
	
	@Test
	public void test() {
		
		UpdateResponse updateResponse = mock(UpdateResponse.class);

		when(dataSource.update(any())).thenReturn(updateResponse);
		when(updateResponse.getReturn()).thenReturn(new Data());
		
		Data outputData = service.dataUpdate(new Data());
		
		assertNotNull(outputData);
	}

}
