package com.ust.calc.calculadora.api.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.impl.EmployeeUpdateServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceWSClientUpdate;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClientUpdate;
import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeUpdateTest {

    private IEmployeeUpdateService employeeUpdateService;

    @Mock
    private IntegrationDSClientUpdate integrationDSClientUpdate;

    @Mock
    private DataSourceWSClientUpdate dataSourceWSClientUpdate;

    @Mock
    private EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;

    @Mock
    private EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;

    @Before
    public void SetUp() {
        employeeUpdateService = new EmployeeUpdateServiceImpl(
            integrationDSClientUpdate,
            converterEmployeeToEmployeeDS,
            converterEmployeeDSToEmployee);
    }

    @Test
    public void testEmployeeUpdate() {

        Employee employee = mock(Employee.class);
        EmployeeDS outputClientCall = mock(EmployeeDS.class);
        EmployeeDS employeeUpdated = mock(EmployeeDS.class);
        when(converterEmployeeToEmployeeDS.convert(employee)).thenReturn(outputClientCall);
        when(integrationDSClientUpdate.employeeUpdate(outputClientCall)).thenReturn(employeeUpdated);
        when(converterEmployeeDSToEmployee.convert(employeeUpdated)).thenReturn(mock(Employee.class));
        Employee outputService = employeeUpdateService.updateEmployee(employee);
        verify(converterEmployeeToEmployeeDS, times(1)).convert(employee);
        verify(integrationDSClientUpdate, times(1)).employeeUpdate(outputClientCall);
        verify(converterEmployeeDSToEmployee, times(1)).convert(employeeUpdated);
        assertThat(outputService).isNotNull();
        verify(integrationDSClientUpdate).employeeUpdate(any());
    }

}
