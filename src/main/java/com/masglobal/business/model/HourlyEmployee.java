package com.masglobal.business.model;

public class HourlyEmployee extends Employee {

  private HourlyEmployee() { }

  public static HourlyEmployee createInstance() {
    return new HourlyEmployee();
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
    super.annualSalary = 120 * salary * 12;
    return this;
  }
}
