package com.ust.calc.calculadora.clients;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.UpdateResponse;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class DataSourceWSClientModifications {

	private final DataSourceWSStubModifications dataSourceWSStubDelete;

	public void delete(String id) {
		dataSourceWSStubDelete.deleteData(id);
	}

	public Data dataUpdate(Data data) {
		UpdateResponse updateResponse = dataSourceWSStubDelete.update(data);
		return updateResponse.getReturn();
	}

}
