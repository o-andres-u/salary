package com.masglobal.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class EmployeesConsumer {

    @Autowired
    private final RestTemplate restTemplate;
    @Value("endpoint")
    private final String employeesEndpoint;

    public EmployeesConsumer(RestTemplate restTemplate, String employeesEndpoint) {
        this.restTemplate = restTemplate;
        this.employeesEndpoint = employeesEndpoint;
    }

    public String getEmployees() {
        return restTemplate.getForObject(employeesEndpoint, String.class);
    }

}
