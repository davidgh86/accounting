package com.ust.calc.calculadora.api.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.wsdlstub.Data;

@Component
public class EmployeeDSToDataConverter implements Converter<EmployeeDS,Data>{
	
	@Override
	public Data convert(EmployeeDS employeeDS) {
		
		Data employeeData = new Data();
		employeeData.setCategoria(employeeDS.getCategoria());
		employeeData.setCtacte(employeeDS.getCtacte());
		employeeData.setDireccion(employeeDS.getDireccion());
		employeeData.setDni(employeeDS.getDni());
		employeeData.setEmail(employeeDS.getEmail());
		employeeData.setEstadocivil(employeeDS.getEstadocivil());
		employeeData.setFecalta(employeeDS.getFecalta());
		employeeData.setFecbaja(employeeDS.getFecbaja());
		employeeData.setFecnac(employeeDS.getFecnac());
		employeeData.setId(employeeDS.getId());
		employeeData.setName(employeeDS.getName());
		employeeData.setNsegsoc(employeeDS.getNsegsoc());
		employeeData.setNumtel(employeeDS.getNumtel());
		employeeData.setRefCatastro(employeeDS.getRefCatastro());
		employeeData.setSalary(employeeDS.getSalary());
		employeeData.setSexo(employeeDS.getSexo());
		employeeData.setTipocontrato(employeeDS.getTipocontrato());
		
		return employeeData;
		
	}

}
