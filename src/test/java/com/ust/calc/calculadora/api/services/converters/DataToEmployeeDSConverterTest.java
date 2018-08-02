package com.ust.calc.calculadora.api.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.wsdlstub.Data;

@RunWith(JUnit4.class)
public class DataToEmployeeDSConverterTest {

	@Test
	public void test() {
		Data input = new Data();
		input.setCategoria("");
		input.setCtacte("");
		input.setDireccion("");
		input.setDni("");
		input.setEmail("");
		input.setEstadocivil("");
		input.setFecalta("");
		input.setFecbaja("");
		input.setFecnac("");
		input.setId("");
		input.setName("");
		input.setNsegsoc("");
		input.setNumtel("");
		input.setRefCatastro("");
		input.setSalary("");
		input.setSexo("");
		input.setTipocontrato("");
		EmployeeDS output = new DataToEmployeeDSConverter().convert(input);
		assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
	}

}
