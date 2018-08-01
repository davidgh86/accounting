package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.impl.EmployeeResumeListServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;

@RunWith(MockitoJUnitRunner.class)
public class ResumeListEmployeeServiceTest {
	
    private IEmployeeResumeListService employeeResumeListService;

    private @Mock
    IntegrationResumeListDSClient integrationResumeListDSClient;
    
    private @Mock
    DataSourceClient dataSourceClient;
    
    private @Mock
    EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private @Mock
    EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;

    @Before
    public void setUp() {
    	employeeResumeListService = new EmployeeResumeListServiceImpl(integrationResumeListDSClient, converterEmployeeDSToEmployee);
    }

    @Test
    public void testEmployeeResumeList() { 
    	List<EmployeeDS> employeesDS = new ArrayList<EmployeeDS>();
        when(integrationResumeListDSClient.resumeListEmployee()).thenReturn(employeesDS);
        List<Employee> employees = employeeResumeListService.resumeListEmployee();
        assertThat(employees).isNotNull();
    }
    
    @Test
    public void testEmployeeResumeListData() { 
    	List<EmployeeDS> employeesDS = new ArrayList<EmployeeDS>();
    	EmployeeDS employeeDS = new EmployeeDS("1", "jose1", "a@b.es", "10000","Y", "12757747R", "01/02/1990", "Calle Nueva 1", "01234567890123456789", "S", "V", "01/06/2015", "H", "I", "11111111111111111111", "123456789", "01/07/2018","859KDFJ389759");
    	employeesDS.add(employeeDS);
    	
        when(integrationResumeListDSClient.resumeListEmployee()).thenReturn(employeesDS);
        List<Employee> employees = employeeResumeListService.resumeListEmployee();
        assertThat(employees.size() > 0).isTrue();
    }	

    

}
