package com.ust.calc.calculadora.api.controllers;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.services.IEmployeeDetailQueryService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDetailQueryControllerTest {

    private IEmployeeDetailQueryController employeeController;

    @Mock
    private IEmployeeDetailQueryService service;

    @Before
    public void setUp() {
        employeeController = new EmployeeDetailQueryControllerImpl(service);
    }

    @Test
    public void testNIFOK() {       

        Mockito.when(service.getEmployeeDetailsByNIF(Mockito.any(String.class))).thenReturn(new Employee());

        ResponseEntity<Employee> employeeResult = employeeController.getEmployeeDetailsByNIF("83479509F");
        assertNotNull(employeeResult);
    }
    
    @Test
    public void testNameOK() {       

        Mockito.when(service.getEmployeeDetailsByNIF(Mockito.any(String.class))).thenReturn(new Employee());

        ResponseEntity<List<Employee>> employeeResult = employeeController.getEmployeeDetailsByName("alotes");
        assertNotNull(employeeResult);
    }

}
