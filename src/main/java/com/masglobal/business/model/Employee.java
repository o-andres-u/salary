package com.masglobal.business.model;

public abstract class Employee {
  protected Integer id;
  protected String name;
  protected String contractType;
  protected String roleName;
  protected Double annualSalary;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getContractType() {
    return contractType;
  }

  public String getRoleName() {
    return roleName;
  }

  public Double getAnnualSalary() {
    return annualSalary;
  }

  public abstract Employee withId(Integer id);
  public abstract Employee withName(String name);
  public abstract Employee withContractType(String contractType);
  public abstract Employee withRoleName(String roleName);
  public abstract Employee withAnnualSalary(Double salary);
}
