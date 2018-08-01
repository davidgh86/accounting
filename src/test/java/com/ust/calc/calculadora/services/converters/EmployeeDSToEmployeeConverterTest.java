package com.ust.calc.calculadora.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;

@RunWith(JUnit4.class)
public class EmployeeDSToEmployeeConverterTest {

	@Test
    public void testConverter() {
		
		EmployeeDS input = new EmployeeDS("","","","","","","","","","","","","","","","", "","");
		Employee output = new EmployeeDSToEmployeeConverter().convert(input);
    	assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
    }
}
