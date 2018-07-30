package com.ust.calc.calculadora.api.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.datasource.api.Data;

@RunWith(JUnit4.class)
public class EmployeeDSToDataConverterTest {
	
	@Test
	public void test() {
		EmployeeDS input = new EmployeeDS("", "", "","", "", "", "", "", "", "", "", "", "", "", "", "", "");
		Data output = new EmployeeDSToDataConverter().convert(input);
		assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
	}

}
