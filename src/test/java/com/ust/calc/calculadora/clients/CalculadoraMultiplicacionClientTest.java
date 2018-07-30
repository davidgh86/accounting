package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore("to be deprecated")
@Deprecated
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class CalculadoraMultiplicacionClientTest {

	@Autowired
	private CalculadoraMultiplicacionClient multClient;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void happyTest() {
		Integer resultado = multClient.multiply(5,2);
		assertThat(resultado).isEqualTo(0);
	}
	
	@Test
	public void unhappyTest() {
		Integer resultado = multClient.multiply(8,2);
		assertThat(resultado).isNotEqualTo(10);
	}
	
	

}
