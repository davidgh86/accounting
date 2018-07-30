package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="substrationClient", url="http://localhost:8085")
public interface CalculadoraRestaClient {

	@RequestMapping(method = RequestMethod.GET, value = "/resta/{uno}/{dos}")
	public Integer resta(@PathVariable(name="uno") Integer uno, @PathVariable(name="dos") Integer dos);
}
