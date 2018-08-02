package com.ust.calc.calculadora.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@Component
public class EmployeeDSToEmployeeConverter implements Converter<EmployeeDS, Employee> {
	

	@Override
	public Employee convert(EmployeeDS employeeDS) {
		
		Contract contract = new Contract(employeeDS.getCategoria(),employeeDS.getTipocontrato(),employeeDS.getFecalta(),employeeDS.getSalary(),employeeDS.getCurrency(),employeeDS.getFecbaja(),employeeDS.getNsegsoc(),employeeDS.getEstadocivil(),employeeDS.getCtacte());
		Employee employee = new Employee(employeeDS.getName(),employeeDS.getDireccion(),employeeDS.getEmail(),employeeDS.getDni(),null,employeeDS.getNumtel(),employeeDS.getSexo(),employeeDS.getId(),contract, employeeDS.getRefCatastro());
		
		return employee;
	}

}
