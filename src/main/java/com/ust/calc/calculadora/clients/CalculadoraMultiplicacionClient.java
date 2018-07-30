package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "multiplicationClient", url = "http://localhost:8080")
public interface CalculadoraMultiplicacionClient {

    @GetMapping("/multiply/{one}/{two}")
    Integer multiply(@PathVariable(name = "one") Integer one, @PathVariable(name = "two") Integer two);
}
