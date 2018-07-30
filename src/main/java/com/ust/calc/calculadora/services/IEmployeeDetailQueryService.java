package com.ust.calc.calculadora.services;

import java.util.List;

import com.ust.calc.calculadora.api.resources.Employee;

public interface IEmployeeDetailQueryService {

	Employee getEmployeeDetailsByNIF(final String param);
	List<Employee> getEmployeeDetailsByName(final String param);

}
