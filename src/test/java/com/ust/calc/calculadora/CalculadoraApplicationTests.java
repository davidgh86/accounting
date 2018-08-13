package com.ust.calc.calculadora;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;

import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.github.tomakehurst.wiremock.junit.WireMockRule;



@SpringBootTest(classes = CalculadoraApplication.class,webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ContextConfiguration
public class CalculadoraApplicationTests {

	@LocalServerPort
	String port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private MockMvc mockMvc;

	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8080); // No-args constructor defaults to port 8080
	
	public ResultActions postRestOK(String endPoint, String json) throws Exception {

		// Stubbing WireMock
		wireMockRule.stubFor(post("/data").willReturn(aResponse().withBody(
				"{\"name\": \"ruben\",\"email\": \"ruben@rubenacho.com\",\"dni\": \"42635765B\",\"refCatastro\": \"8357VDA13CV34C\", \"fecnac\":\"Sat Jan 01 01:00:00 CET 2000\"}")));

		// Sin devolver fecnac, para preguntar solo por el estado HTTP también funciona
		return mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(endPoint)
				.content(json).contentType(MediaType.APPLICATION_JSON_UTF8));
	}

	public ResponseEntity<String> postRestKO(String endPoint, String json) throws Exception {		 

		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		final HttpEntity<String> httpEntity = new HttpEntity<String>(json, headers);
		ResponseEntity<String> response = testRestTemplate.postForEntity("http://localhost:" + port + endPoint,
				httpEntity, String.class);		
		return response;

	}

}
