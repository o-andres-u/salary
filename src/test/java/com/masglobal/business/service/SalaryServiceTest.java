package com.masglobal.business.service;

import com.masglobal.business.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryServiceTest {

  private SalaryService salaryService;

  @BeforeEach
  public void setup() {
    salaryService = new SalaryService();
  }

  @Test
  public void getEmployeeInformationTest() {
    Employee employee = salaryService.getEmployeeInformation(1);
    assertEquals(employee.getId(), 1);
    assertEquals(employee.getName(), "Andrea");
    assertEquals(employee.getContractType(), "HourlySalaryEmployee");
    assertEquals(employee.getRoleName(), "Administrator");
    assertEquals(employee.getAnnualSalary(), 14_400_000);

    employee = salaryService.getEmployeeInformation(2);
    assertEquals(employee.getId(), 2);
    assertEquals(employee.getName(), "Alex");
    assertEquals(employee.getContractType(), "MonthlySalaryEmployee");
    assertEquals(employee.getRoleName(), "Contractor");
    assertEquals(employee.getAnnualSalary(), 600_000);
  }

}
