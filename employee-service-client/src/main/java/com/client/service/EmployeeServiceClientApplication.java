package com.client.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EmployeeServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceClientApplication.class, args);
	}
}
