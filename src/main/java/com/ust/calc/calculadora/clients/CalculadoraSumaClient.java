package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="sumClient", url="http://localhost:8086")
public interface CalculadoraSumaClient {

	@RequestMapping(method = RequestMethod.GET, value = "/suma/{uno}/{dos}")
	public Integer suma(@PathVariable(name="uno") Integer uno, @PathVariable(name="dos") Integer dos);
}