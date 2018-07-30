package com.ust.calc.calculadora.datasource.api;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceFeature;

public interface DataOperationPortService {


	public DataOperation getDataOperationPortImplPort();
	public DataOperation getDataOperationPortImplPort(WebServiceFeature... features);
}
