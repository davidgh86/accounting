package com.ust.calc.calculadora.api.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.datasource.api.Data;

@Component
public class EmployeeDSToDataConverter implements Converter<EmployeeDS,Data>{
	
	@Override
	public Data convert(EmployeeDS employeeDS) {
		
		Data employeeData = new Data(employeeDS.getId(), employeeDS.getName(), employeeDS.getEmail(), employeeDS.getSalary(), employeeDS.getDni(),
				employeeDS.getFecnac(), employeeDS.getDireccion(), employeeDS.getCtacte(), employeeDS.getEstadocivil(), employeeDS.getSexo(), 
				employeeDS.getFecalta(), employeeDS.getCategoria(), employeeDS.getTipocontrato(), employeeDS.getNsegsoc(), employeeDS.getNumtel(), employeeDS.getFecbaja());
		
		return employeeData;
		
	}

}
