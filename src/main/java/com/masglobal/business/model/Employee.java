package com.masglobal.business.model;

public abstract class Employee {
  protected Integer id;
  protected String name;
  protected String contractType;
  protected String roleName;
  protected Double annualSalary;

  public abstract Employee withId(Integer id);
  public abstract Employee withName(String name);
  public abstract Employee withContractType(String contractType);
  public abstract Employee withRoleName(String roleName);
  public abstract Employee withAnnualSalary(Double salary);
}
