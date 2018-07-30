package com.ust.calc.calculadora.clients;

import java.util.List;

import com.ust.calc.calculadora.wsdlstub.Data;

public interface IDataSourceWSClient {

	Data getEmployeeDetailsByNIF(String dni);
	List<Data> getEmployeeDetailsByName(String name);

}
