package com.ust.calc.calculadora.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.wsdlstub.Data;

@Component
public class DataProviderToEmployeeConverter implements Converter<Data, Employee> {
	

	@Override
	public Employee convert(Data data) {
		
		return Employee.builder()
				.address(data.getDireccion())
				.email(data.getEmail())
				.name(data.getName())
				.dni(data.getDni())
				.phoneNumber(data.getNumtel())
				.sex(data.getSexo())
				.id(data.getId())
				.build();
	}

}
