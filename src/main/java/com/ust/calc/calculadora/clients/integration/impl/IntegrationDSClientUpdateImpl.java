package com.ust.calc.calculadora.clients.integration.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.services.converters.DataToEmployeeDSConverter;
import com.ust.calc.calculadora.api.services.converters.EmployeeDSToDataConverter;
import com.ust.calc.calculadora.clients.DataSourceWSClientModifications;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClientUpdate;
import com.ust.calc.calculadora.wsdlstub.Data;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class IntegrationDSClientUpdateImpl implements IntegrationDSClientUpdate {
	
	private final DataSourceWSClientModifications dataSourceWSClientDelete;
	private final EmployeeDSToDataConverter employeeDSToDataConverter;
	private final DataToEmployeeDSConverter dataToEmployeeDSConverter;

	@Override
	public EmployeeDS employeeUpdate(EmployeeDS employeeDS) {
		
		Data data=employeeDSToDataConverter.convert(employeeDS);
		
		data = dataSourceWSClientDelete.dataUpdate(data);
		
		return dataToEmployeeDSConverter.convert(data);
	}
	
	
	

}
