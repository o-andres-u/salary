package com.masglobal.consumer;

import com.masglobal.business.model.MasGlobalEmployee;
import org.springframework.web.client.RestTemplate;

public class EmployeesConsumer {

    private final RestTemplate restTemplate;
    private final String employeesEndpoint;

    public EmployeesConsumer() {
        this(new RestTemplate(), "http://masglobaltestapi.azurewebsites.net/api/employees");
    }

    public EmployeesConsumer(RestTemplate restTemplate, String employeesEndpoint) {
        this.restTemplate = restTemplate;
        this.employeesEndpoint = employeesEndpoint;
    }

    public MasGlobalEmployee[] getEmployees() {
        return restTemplate.getForObject(employeesEndpoint, MasGlobalEmployee[].class);
    }
}
