package com.masglobal.consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    String response = employeesConsumer.getEmployees();
    assertNotNull(response);
  }

}
