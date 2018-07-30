package com.ust.calc.calculadora.clients;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.datasource.api.Data;
import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class DataSourceWSClientUpdate {

	private final DataOperationPortImplService service;
	
	public Data dataUpdate(Data data){
		
		DataOperation dataOperation = service.getDataOperationPortImplPort();
        
        return dataOperation.update(data);
        
    }

}
