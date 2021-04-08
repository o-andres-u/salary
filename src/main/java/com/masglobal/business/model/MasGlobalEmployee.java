package com.masglobal.business.model;

public class MasGlobalEmployee {
  private Integer id;
  private String name;
  private String contractTypeName;
  private Integer roleId;
  private String roleName;
  private String roleDescription;
  private Double hourlySalary;
  private Double monthlySalary;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContractTypeName() {
    return contractTypeName;
  }

  public void setContractTypeName(String contractTypeName) {
    this.contractTypeName = contractTypeName;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getRoleDescription() {
    return roleDescription;
  }

  public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
  }

  public Double getHourlySalary() {
    return hourlySalary;
  }

  public void setHourlySalary(Double hourlySalary) {
    this.hourlySalary = hourlySalary;
  }

  public Double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(Double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }
}
