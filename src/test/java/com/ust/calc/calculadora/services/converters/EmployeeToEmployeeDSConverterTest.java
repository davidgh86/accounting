package com.ust.calc.calculadora.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;

@RunWith(JUnit4.class)
public class EmployeeToEmployeeDSConverterTest {

	@Test
    public void testConverter() {
		
		Employee input = new Employee("James","","james@gmail.com","54765872J",Calendar.getInstance().getTime(),"","","",new Contract("", "", "","","", "","","",""),"");
		EmployeeDS output = new EmployeeToEmployeeDSConverter().convert(input);
    	assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("James");
    }
}
