package com.ust.calc.calculadora;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

@SpringBootTest(classes = CalculadoraApplication.class)
@AutoConfigureMockMvc
@ContextConfiguration
public class CalculadoraApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8080); // No-args constructor defaults to port 8080
	
    public void postRestOK(String endPoint, String json) throws Exception {
		
    	// Stubbing WireMock
		stubFor(post(urlEqualTo("/data"))
				.willReturn(aResponse().withBody("{\"name\": \"ruben\",\"email\": \"ruben@rubenacho.com\",\"dni\": \"42635765B\",\"refCatastro\": \"8357VDA13CV34C\"}")));
    			
		mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(endPoint)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON_UTF8))
			.andExpect(status().isCreated());
	}
    
    public void postRestKO(String endPoint, String json) throws Exception {
		
    		
		mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(endPoint)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON_UTF8))
			.andExpect(status().isBadRequest())
			.andExpect(jsonPath("$.errors[0]$.defaultMessage").value("cadastreRef size must be 14 or 20 characters"));
	}
	

}
