package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore("to be deprecated")
@Deprecated
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraSumaClientTest {

	@Autowired
	private CalculadoraSumaClient restClient;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void happyTest() {
		double resultado = restClient.suma(6,2);
		assertThat(resultado).isEqualTo(8);
	}
	
	@Test
	public void unhappyTest() {
		double resultado = restClient.suma(8,2);
		assertThat(resultado).isNotEqualTo(6);
	}

}