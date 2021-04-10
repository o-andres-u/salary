package com.masglobal.business.factory;

import com.masglobal.business.model.Employee;
import com.masglobal.business.model.HourlyEmployee;
import com.masglobal.business.model.MasGlobalEmployee;
import com.masglobal.business.model.MonthlyEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeFactoryTest {

  private EmployeeFactory factory;

  @BeforeEach
  public void setup() {
    factory = new EmployeeFactory();
  }

  @Test
  public void getEmployeeFunctionTest() {
    MasGlobalEmployee masGlobalEmployee = new MasGlobalEmployee();
    masGlobalEmployee.setId(1);
    masGlobalEmployee.setName("Lupita");
    masGlobalEmployee.setContractTypeName("HourlySalaryEmployee");
    masGlobalEmployee.setRoleId(1);
    masGlobalEmployee.setRoleName("Developer");
    masGlobalEmployee.setHourlySalary(10000.0);
    masGlobalEmployee.setMonthlySalary(50000.0);

    Employee employee = factory.getEmployee.apply(masGlobalEmployee);
    assertTrue(employee instanceof HourlyEmployee);
    assertEquals(120 * 10000.0 * 12, employee.getAnnualSalary());

    masGlobalEmployee.setContractTypeName("MonthlySalaryEmployee");
    employee = factory.getEmployee.apply(masGlobalEmployee);
    assertTrue(employee instanceof MonthlyEmployee);
    assertEquals(50000.0 * 12, employee.getAnnualSalary());
  }
}
