package com.ust.calc.calculadora.api.controllers;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeResumeListService;

@RunWith(MockitoJUnitRunner.class)
public class ResumeListEmployeeControllerTest {
	
    private ResumeListEmployeeController resumeListEmployeeController;

    @Mock
    private IEmployeeResumeListService service;

    @Before
    public void setUp() {
    	resumeListEmployeeController = new ResumeListEmployeeController(service);
    }

    @Test
    public void callRestOk() {

        List<Employee> employees = new ArrayList<Employee>();
        Mockito.when(service.resumeListEmployee()).thenReturn(employees);

        resumeListEmployeeController.resumeListEmployee();
        assertNotNull(employees);
    }	

}
