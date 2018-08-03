package com.ust.calc.calculadora;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = CalculadoraApplication.class)
@AutoConfigureMockMvc
@ContextConfiguration
public class CalculadoraApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
    public void postRest(String endPoint, String json) throws Exception {
		
		mockMvc.perform(post(endPoint)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON_UTF8))
			.andExpect(status().isCreated());
	}
	

}
