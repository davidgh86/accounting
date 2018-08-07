package com.ust.calc.calculadora.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class JsonDateSerializer extends JsonSerializer<Date>{

	private final SimpleDateFormat dateFormat;
	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		gen.writeString(dateFormat.format(value));
		
	}

}
