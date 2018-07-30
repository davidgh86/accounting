package com.ust.calc.calculadora.clients;

public interface EmployeeDeleteClient {

	/**
	 * Call other service where is the datasource with employees
	 */
	public void deleteEmployee(String id);

}
