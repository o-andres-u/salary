package com.masglobal.consumer;

import com.masglobal.business.model.MasGlobalEmployee;
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

    public MasGlobalEmployee[] getEmployees() {
        return restTemplate.getForObject(employeesEndpoint, MasGlobalEmployee[].class);
    }

}
