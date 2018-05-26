package com.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.client.service.fiegninterfaces.EmployeeClient;
import com.client.service.model.Employee;


@RequestMapping("/rest/emp")
@RestController
public class EmployeeService {

	@Autowired
    RestTemplate restTemplate;
	
	@Autowired
	EmployeeClient employeeClient;

    @GetMapping("id/{userid}")
    public Employee getStock(@PathVariable("userid") final int userid) {
        System.out.println("In get stock"+userid);
       /* ResponseEntity<List<String>> quoteResponse = restTemplate.exchange("http://localhost:8300/rest/db/" + userName, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<String>>() {
                });*/
        
        ResponseEntity<Employee> quoteResponse = restTemplate.exchange("http://employee-service/rest/db/" + userid, HttpMethod.GET,
                null, new ParameterizedTypeReference<Employee>() {
                });
        
       //Employee quotes = quoteResponse.getBody();
      //  return quotes;
        
        return employeeClient.getEmployee(userid);
        
        /*return quotes
                .stream()
                .map(this::getStockPrice)
                .collect(Collectors.toList());*/
    }
	
    
    
}