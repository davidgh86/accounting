package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.ust.calc.calculadora.datasource.api.Data;
import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceWSClientUpdateTest {
	
	private DataSourceWSClientUpdate datasourceClient;
	
	@Mock
	private DataOperationPortImplService service;
	
	@Mock
	DataOperation dataOperation;
	
	@Before
	public void setUp() {
		datasourceClient = new DataSourceWSClientUpdate(service);
	}
	
	@Test
	public void test() {
		
		when(service.getDataOperationPortImplPort()).thenReturn(dataOperation);
		when(dataOperation.update(any())).thenReturn(new Data());
		
		datasourceClient.dataUpdate(new Data());
    	
	}

}
