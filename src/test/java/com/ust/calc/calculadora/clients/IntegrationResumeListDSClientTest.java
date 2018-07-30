package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationResumeListDSClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class IntegrationResumeListDSClientTest {
	
	private IntegrationResumeListDSClient integrationResumeListDSClient;
	
	@Mock
	private List<EmployeeDS> employeeResults;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private LinkedHashMap<String, LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>> response;
	
	@Mock
	private LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>> _embedded;
	
	private ArrayList<LinkedHashMap<String, String>> data;
	private LinkedHashMap<String, String> lhm;
	
	
	@Before
    public void setUp() {
		integrationResumeListDSClient = new IntegrationResumeListDSClientImpl(restTemplate);
		data = new ArrayList<LinkedHashMap<String, String>>();
		lhm = new LinkedHashMap<String, String>(); 
	}
	
	@Test
	public void happyTest() throws JsonProcessingException {
    	
		when( (LinkedHashMap<String, LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>>)restTemplate.getForObject("http://localhost:8080/data", Object.class) ).thenReturn( response );
		when( (LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>)response.get("_embedded") ).thenReturn( _embedded );
		when( (ArrayList<LinkedHashMap<String, String>>)_embedded.get("data") ).thenReturn( data );
		
    	employeeResults = integrationResumeListDSClient.resumeListEmployee();
    	assertThat(employeeResults).isNotNull();
    	
	}	

	@Test
	public void happyDataTest() throws JsonProcessingException {
		
		lhm.put("id", "1");
		lhm.put("name", "jose1");
		lhm.put("email", "a@b.es");
		lhm.put("salary", "10000");
		lhm.put("dni", "12757747R");
		lhm.put("fecnac", "01/02/1990");
		lhm.put("direccion", "Calle Nueva 1");
		lhm.put("ctacte", "01234567890123456789");
		lhm.put("estadocivil", "S");
		lhm.put("sexo", "V");
		lhm.put("fecalta", "01/06/2015");
		lhm.put("categoria", "H");
		lhm.put("tipocontrato", "I");
		lhm.put("nsegsoc", "11111111111111111111");
		lhm.put("numtel", "123456789");
		lhm.put("fecbaja", "01/07/2018");
		
		data.add(lhm);
		
		when( (LinkedHashMap<String, LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>>)restTemplate.getForObject("http://localhost:8080/data", Object.class) ).thenReturn( response );
		when( (LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>)response.get("_embedded") ).thenReturn( _embedded );
		when( (ArrayList<LinkedHashMap<String, String>>)_embedded.get("data") ).thenReturn( data );
		
    	employeeResults = integrationResumeListDSClient.resumeListEmployee();
    	assertThat(employeeResults.size() > 0).isTrue();
		
	}	

}
