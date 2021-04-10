package com.masglobal.business.factory;

import com.masglobal.business.model.Employee;
import com.masglobal.business.model.HourlyEmployee;
import com.masglobal.business.model.MasGlobalEmployee;
import com.masglobal.business.model.MonthlyEmployee;

import java.util.function.Function;

public class EmployeeFactory {

  public Function<MasGlobalEmployee, Employee> getEmployee = masGlobalEmployee -> {
    switch (masGlobalEmployee.getContractTypeName()) {
      case "HourlySalaryEmployee":
        HourlyEmployee hourly = HourlyEmployee.createInstance();
        return hourly
            .withId(masGlobalEmployee.getId())
            .withName(masGlobalEmployee.getName())
            .withRoleName(masGlobalEmployee.getRoleName())
            .withContractType(masGlobalEmployee.getContractTypeName())
            .withAnnualSalary(masGlobalEmployee.getHourlySalary());
      case "MonthlySalaryEmployee":
        MonthlyEmployee monthly = MonthlyEmployee.createInstance();
        return monthly
            .withId(masGlobalEmployee.getId())
            .withName(masGlobalEmployee.getName())
            .withRoleName(masGlobalEmployee.getRoleName())
            .withContractType(masGlobalEmployee.getContractTypeName())
            .withAnnualSalary(masGlobalEmployee.getMonthlySalary());
    }
    return null;
  };
}
