package com.masglobal.business.controller;

import com.masglobal.business.model.EmployeeDTO;
import com.masglobal.business.service.SalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryController {

  private final SalaryService salaryService;

  SalaryController(SalaryService salaryService) {
    this.salaryService = salaryService;
  }

  @GetMapping("/employees")
  public List<EmployeeDTO> getEmployeesInformation() {
    return salaryService.getEmployeesInformation();
  }

  @GetMapping("/employees/{id}")
  public EmployeeDTO getEmployeeInformationById(@PathVariable Integer id) {
    return salaryService.getEmployeeInformation(id);
  }
}
