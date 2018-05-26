package com.client.service.fiegninterfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.client.service.model.Employee;

@FeignClient("employee-service")
public interface EmployeeClient {
	@RequestMapping(method = RequestMethod.GET, value = "/rest/db/{userid}")
	public Employee getEmployee(@PathVariable("userid") Integer userid);
}
