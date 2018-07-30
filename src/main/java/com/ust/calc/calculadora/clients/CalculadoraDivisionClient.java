package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="divisionClient", url="http://localhost:8084")
public interface CalculadoraDivisionClient {

	@RequestMapping(method = RequestMethod.GET, value = "/division/{a}/{b}")
	public double division(@PathVariable(value = "a") double a, @PathVariable(value = "b") double b);
}
