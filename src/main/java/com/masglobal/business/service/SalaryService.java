package com.masglobal.business.service;

import com.masglobal.business.model.EmployeeDTO;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class SalaryService {

  public List<EmployeeDTO> getEmployeesInformation() {
    return Collections.emptyList();
  }

  public EmployeeDTO getEmployeeInformation(Integer id) {
    return new EmployeeDTO();
  }
}
