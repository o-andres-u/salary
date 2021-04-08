package com.masglobal.consumer;

import com.masglobal.business.model.MasGlobalEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeesConsumerTest {

  private EmployeesConsumer employeesConsumer;

  @BeforeEach
  public void setup() {
    employeesConsumer = new EmployeesConsumer(
        new RestTemplate(),
        "http://masglobaltestapi.azurewebsites.net/api/employees"
    );
  }

  @Test
  public void getEmployeesTest() {
    MasGlobalEmployee[] response = employeesConsumer.getEmployees();
    assertNotNull(response);
    assertTrue(response.length > 0);
  }

}
