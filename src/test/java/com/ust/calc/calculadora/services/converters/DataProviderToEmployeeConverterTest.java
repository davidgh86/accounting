package com.ust.calc.calculadora.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.wsdlstub.Data;

@RunWith(JUnit4.class)
public class DataProviderToEmployeeConverterTest {

	@Test
    public void testConverter() {
		
		Data input = new Data();
		Employee output = new DataProviderToEmployeeConverter().convert(input);
    	assertThat(output).isNotNull();    	
    }
}
