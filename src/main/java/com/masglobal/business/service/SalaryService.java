package com.masglobal.business.service;

import com.masglobal.business.factory.EmployeeFactory;
import com.masglobal.business.model.Employee;
import com.masglobal.business.model.MasGlobalEmployee;
import com.masglobal.consumer.EmployeesConsumer;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class SalaryService {

  private final EmployeesConsumer employeesConsumer;
  private final EmployeeFactory employeeFactory;

  public SalaryService() {
    this.employeesConsumer = new EmployeesConsumer();
    this.employeeFactory = new EmployeeFactory();
  }

  public List<Employee> getEmployeesInformation() {
    MasGlobalEmployee[] employees = employeesConsumer.getEmployees();
    return Collections.emptyList();
  }

  public Employee getEmployeeInformation(Integer id) {
    MasGlobalEmployee[] employees = employeesConsumer.getEmployees();
    return Arrays.stream(employees)
        .filter(e -> e.getId().equals(id))
        .findFirst()
        .map(employeeFactory.getEmployee)
        .orElseThrow(IllegalArgumentException::new);
  }
}
