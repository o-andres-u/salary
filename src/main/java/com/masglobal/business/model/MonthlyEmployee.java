package com.masglobal.business.model;

public class MonthlyEmployee extends Employee {

  private MonthlyEmployee() { }

  public static MonthlyEmployee createInstance() {
    return new MonthlyEmployee();
  }

  @Override
  public Employee withId(Integer id) {
    super.id = id;
    return this;
  }

  @Override
  public Employee withName(String name) {
    super.name = name;
    return this;
  }

  @Override
  public Employee withContractType(String contractType) {
    super.contractType = contractType;
    return this;
  }

  @Override
  public Employee withRoleName(String roleName) {
    super.roleName = roleName;
    return this;
  }

  @Override
  public Employee withAnnualSalary(Double salary) {
    super.annualSalary = salary * 12;
    return this;
  }
}
