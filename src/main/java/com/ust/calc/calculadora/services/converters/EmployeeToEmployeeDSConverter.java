package com.ust.calc.calculadora.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@Component
public class EmployeeToEmployeeDSConverter implements Converter<Employee, EmployeeDS> {

	@Override
	public EmployeeDS convert(Employee employee) {

		EmployeeDS employeeDS = new EmployeeDS(employee.getId(), employee.getName(), employee.getEmail(), employee.getContract().getSalary(), 
				employee.getDni(), employee.getBirthDate().toString(), employee.getAddress(),
				employee.getContract().getCurrentAccount(), employee.getContract().getCivilStatus(), employee.getSex(),
				employee.getContract().getStartDate(), employee.getContract().getCategory(),
				employee.getContract().getContractType(), employee.getContract().getInsuranceNumber(),
				employee.getPhoneNumber(), employee.getContract().getEndDate(), employee.getRefCatastro());

		return employeeDS;
	}

}
