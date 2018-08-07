package com.ust.calc.calculadora.clients.integration.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;


@Service
public class IntegrationResumeListDSClientImpl implements IntegrationResumeListDSClient {
	
	
	private final RestTemplate restTemplate;
	
	public IntegrationResumeListDSClientImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDS> resumeListEmployee() {
		
		List<EmployeeDS> salida = new ArrayList<EmployeeDS>();
		
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>> response = (LinkedHashMap<String, LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>>)restTemplate.getForObject("http://localhost:8080/data", Object.class);
		LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>> _embedded = (LinkedHashMap<String, ArrayList<LinkedHashMap<String, String>>>)response.get("_embedded");
		ArrayList<LinkedHashMap<String, String>> data = (ArrayList<LinkedHashMap<String, String>>)_embedded.get("data");
		
		if(data!=null) {
			for(int i=0; i<data.size();i++) {
				LinkedHashMap<String, String> lhm = (LinkedHashMap<String, String>)data.get(i);
				String id = (String)lhm.get("id");
				String name = (String)lhm.get("name");
				String email = (String)lhm.get("email");
				String salary = (String)lhm.get("salary");
				String dni = (String)lhm.get("dni");
				String fecnac = (String)lhm.get("fecnac");
				String direccion = (String)lhm.get("direccion");
				String ctacte = (String)lhm.get("ctacte");
				String estadocivil = (String)lhm.get("estadocivil");
				String sexo = (String)lhm.get("sexo");
				String fecalta = (String)lhm.get("fecalta");
				String categoria = (String)lhm.get("categoria");
				String tipocontrato = (String)lhm.get("tipocontrato");
				String nsegsoc = (String)lhm.get("nsegsoc");
				String numtel = (String)lhm.get("numtel");
				String fecbaja = (String)lhm.get("fecbaja");
				String refCatastro = (String)lhm.get("refCatastro");
				
				EmployeeDS employeeDS= new EmployeeDS(id, name, email, salary, dni, fecnac, direccion, ctacte, estadocivil, sexo, fecalta, categoria, tipocontrato, nsegsoc, numtel, fecbaja, refCatastro);
				salida.add(employeeDS);
			}
		}
		
		return salida;
		
	}

}
